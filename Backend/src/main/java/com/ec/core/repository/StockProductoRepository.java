package com.ec.core.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ec.core.entity.Producto;
import com.ec.core.entity.StockProducto;

@Repository
public interface StockProductoRepository extends CrudRepository<StockProducto, Long>{
	
	public StockProducto findByProducto(Producto producto);
	
	public Optional<StockProducto> findById(Long codigo);	

}
