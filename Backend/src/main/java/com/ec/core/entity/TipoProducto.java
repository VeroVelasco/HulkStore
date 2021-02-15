package com.ec.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HS_TIPO_PRODUCTO")
public class TipoProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5785043955773539591L;

	@Id
	private Long codigo;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "FECHA_REGISTRO")
	private Date fechaRegistro;

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

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
