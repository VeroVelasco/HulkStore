package com.ec.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ec.core.entity.Producto;
import com.ec.core.entity.TipoProducto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

	public List<Producto> findByTipoProducto(TipoProducto codigoTipoProducto);
	
	public Producto findByCodigo(Long codigo);
}
