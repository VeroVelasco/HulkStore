package com.ec.core.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ec.core.entity.Producto;
import com.ec.core.entity.TipoProducto;

@Component
public interface IProductoService {

	List<Producto> getProductosPorTipo(TipoProducto tipoProducto);
	Producto getProductoPorCodigo(Long codigo);
	
}
