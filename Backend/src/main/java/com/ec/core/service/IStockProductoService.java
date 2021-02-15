package com.ec.core.service;

import org.springframework.stereotype.Component;

import com.ec.core.entity.Producto;
import com.ec.core.entity.StockProducto;

@Component
public interface IStockProductoService {

	StockProducto saveStockProducto(StockProducto stockProducto);
	
	public StockProducto getStockProductoByProducto(Producto codigoProducto);
	
	public StockProducto getStockProductoById(Long id);
	
}
