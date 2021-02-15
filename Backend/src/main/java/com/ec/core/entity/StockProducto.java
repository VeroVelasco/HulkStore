package com.ec.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ec.core.enums.TipoMovimientoEnum;

@Entity
@Table(name = "HS_STOCK_PRODUCTO")
public class StockProducto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7086792170805233997L;

	@Id
	@Column(name = "CODIGO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HS_STOCK_PRODUCTO_SEQ")
    @SequenceGenerator(sequenceName = "HS_STOCK_PRODUCTO_SEQ", allocationSize = 1, name = "HS_STOCK_PRODUCTO_SEQ")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "CODIGO_PRODUCTO")
	private Producto producto;
	
	@Column(name = "STOCK")
	private Integer stock;

	@Column(name = "FECHA_MOVIMIENTO")
	private Date fechaMovimiento;
	
	@Column(name = "TIPO_MOVIMIENTO")
	private TipoMovimientoEnum tipoMovimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}

	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	public TipoMovimientoEnum getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimientoEnum tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}


}
