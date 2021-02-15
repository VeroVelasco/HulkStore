package com.ec.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HS_PRODUCTO")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5785043955773539591L;

	@Id
	private Long codigo;

	@Column(name = "NOMBRE")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "TIPO_PRODUCTO")
	private TipoProducto tipoProducto;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

}
