package com.ec.core.controller;

import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.core.entity.Producto;
import com.ec.core.entity.RestResponse;
import com.ec.core.entity.StockProducto;
import com.ec.core.entity.TipoProducto;
import com.ec.core.service.IProductoService;
import com.ec.core.service.IStockProductoService;
import com.ec.core.service.ITipoProductoService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/stockProductos")
@ApiResponses(value = { @ApiResponse(code = 200, message = "true"),
		@ApiResponse(code = 404, message = "The resource not found") })
public class StockProductoController {

	private final IProductoService productoService;
	private final IStockProductoService stockProductoService;
	private final ITipoProductoService tipoProductoService;

	@Autowired
	public StockProductoController(IProductoService productoService, IStockProductoService stockProductoService,
			ITipoProductoService tipoProductoService) {
		this.productoService = productoService;
		this.stockProductoService = stockProductoService;
		this.tipoProductoService = tipoProductoService;
	}

	@RequestMapping(value = "/obtenerTiposProducto", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse obtenerTiposProducto() {
		List<TipoProducto> tiposProducto = null;
		try {
			tiposProducto = tipoProductoService.getAllTiposProducto();
		} catch (Exception e) {
			return new RestResponse(null, true, "Error al obtener los tipos de productos: " + e.getMessage());
		}
		return new RestResponse(tiposProducto, false, null);
	}

	@RequestMapping(value = "/obtenerProductosPorTipo/{codigoTipoProducto}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse obtenerProductosPorTipo(@PathVariable("codigoTipoProducto") Long codigoTipoProducto) {
		List<Producto> productos = null;
		TipoProducto tipoProducto = null;
		try {
			tipoProducto = tipoProductoService.getByCodigo(codigoTipoProducto);
			productos = productoService.getProductosPorTipo(tipoProducto);
		} catch (Exception e) {
			return new RestResponse(null, true, "Error al obtener los productos: " + e.getMessage());
		}
		return new RestResponse(productos, false, null);
	}
	
	@RequestMapping(value = "/obtenerStockPorProducto/{codigoProducto}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse obtenerStockPorProducto(@PathVariable("codigoProducto") Long codigoProducto) {
		Producto producto = null;
		StockProducto stockProducto = null;
		try {
			producto = productoService.getProductoPorCodigo(codigoProducto);
			stockProducto = stockProductoService.getStockProductoByProducto(producto);
		} catch (Exception e) {
			return new RestResponse(null, true, "Error al obtener los productos: " + e.getMessage());
		}
		return new RestResponse(stockProducto, false, null);
	}

	@RequestMapping(value = "/guardarStockProducto", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse guardarStockProducto(@RequestBody StockProducto stockProducto) {
		StockProducto stockProductoNuevo;
		try {
			stockProductoNuevo = this.stockProductoService.saveStockProducto(stockProducto);
		} catch (Exception e) {
			return new RestResponse(null, true, "Error al guardar el stock: " + e.getMessage());
		}
		return new RestResponse(stockProductoNuevo, false, null);
	}

}
