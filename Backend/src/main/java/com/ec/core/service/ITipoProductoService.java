package com.ec.core.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ec.core.entity.TipoProducto;

@Component
public interface ITipoProductoService {

	List<TipoProducto> getAllTiposProducto();
	TipoProducto getByCodigo(Long codigo);
	
}
