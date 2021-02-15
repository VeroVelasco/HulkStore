package com.ec.core.enums;

public enum TipoMovimientoEnum {
	INGRESO("Ingreso Producto"),
	SALIDA("Salida Producto");
	
	private String valor;
	
	private TipoMovimientoEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	public static TipoMovimientoEnum obtenerEnumeracion(String valor) {
		for (TipoMovimientoEnum item : TipoMovimientoEnum.values()) {
			if(item.valor.equals(valor)) {
				return item;
			}
		}
		return null;
	}


}
