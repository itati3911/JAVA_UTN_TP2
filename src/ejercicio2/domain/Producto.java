package ejercicio2.domain;

import java.time.LocalDate;

import ejercicio2.utils.TipoProductoEnum;

public class Producto {

	private String nombre;
	private LocalDate fechaCaducidad;
	private int numeroLote;
	private TipoProductoEnum tipoProducto;
	
	public Producto() {
		
	}
	
	public TipoProductoEnum getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProductoEnum tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Producto(String nombre, LocalDate fechaCaducidad, int numeroLote) {
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote
				+ ", tipoProducto=" + tipoProducto + "]";
	}

	public void MostrarProducto() {
		System.out.println(this.toString());
	}
	
}
