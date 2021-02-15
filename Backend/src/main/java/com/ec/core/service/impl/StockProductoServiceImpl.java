package com.ec.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.core.entity.Producto;
import com.ec.core.entity.StockProducto;
import com.ec.core.repository.StockProductoRepository;
import com.ec.core.service.IStockProductoService;

@Service("stockProductoService")
public class StockProductoServiceImpl implements IStockProductoService {
	
	private final StockProductoRepository stockProductoRepository;
	
	@Autowired
	public StockProductoServiceImpl(StockProductoRepository stockProductoRepository) {
		this.stockProductoRepository = stockProductoRepository;
	}

	@Override
	public StockProducto saveStockProducto(StockProducto stockProducto) {
		return stockProductoRepository.save(stockProducto);
	}

	@Override
	public StockProducto getStockProductoByProducto(Producto producto) {
		return stockProductoRepository.findByProducto(producto);
	}

	@Override
	public StockProducto getStockProductoById(Long id) {
		return stockProductoRepository.findById(id).get();
	}

	

}
