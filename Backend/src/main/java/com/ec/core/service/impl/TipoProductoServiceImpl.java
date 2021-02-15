package com.ec.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.core.entity.TipoProducto;
import com.ec.core.repository.TipoProductoRepository;
import com.ec.core.service.ITipoProductoService;

@Service("tipoProductoService")
public class TipoProductoServiceImpl implements ITipoProductoService {
	
	private final TipoProductoRepository tipoProductoRepository;
	
	@Autowired
	public TipoProductoServiceImpl(TipoProductoRepository tipoProductoRepository) {
		this.tipoProductoRepository = tipoProductoRepository;
	}

	@Override
	public List<TipoProducto> getAllTiposProducto() {
		return tipoProductoRepository.findAll();
	}

	@Override
	public TipoProducto getByCodigo(Long codigo) {
		return tipoProductoRepository.findByCodigo(codigo);
	}


}
