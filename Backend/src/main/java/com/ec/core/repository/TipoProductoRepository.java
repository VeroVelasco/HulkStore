package com.ec.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ec.core.entity.TipoProducto;

public interface TipoProductoRepository extends CrudRepository<TipoProducto, Long> {

	public List<TipoProducto> findAll();
	public TipoProducto findByCodigo(Long codigo);
}
