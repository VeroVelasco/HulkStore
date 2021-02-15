package com.ec.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.core.entity.Producto;
import com.ec.core.entity.TipoProducto;
import com.ec.core.repository.ProductoRepository;
import com.ec.core.service.IProductoService;

@Service("productoService")
public class ProductoServiceImpl implements IProductoService {
	
	private final ProductoRepository productoRepository;
	
	@Autowired
	public ProductoServiceImpl(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public List<Producto> getProductosPorTipo(TipoProducto tipoProducto) {
		return productoRepository.findByTipoProducto(tipoProducto);
	}

	@Override
	public Producto getProductoPorCodigo(Long codigo) {
		return productoRepository.findByCodigo(codigo);
	}


}
