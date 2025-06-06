package ejercicio2.utils;

public enum TipoProductoEnum {
	ProductoCongelado(1),
	ProductoFresco(2),
	ProductoRefrigerado(3);
	
	private final int posicion;

	TipoProductoEnum(int posicion) {
		this.posicion = posicion;
	}
	
	public int GetTipoProducto() {
		return posicion;
	}
}
