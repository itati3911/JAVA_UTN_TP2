package ejercicio2.domain;

import java.time.LocalDate;

public class ProductosFrescos extends Producto{
	
	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	
	public ProductosFrescos() {
		super();

	}
	
	public ProductosFrescos(LocalDate fechaEnvasado, String paisOrigen) {
		super();
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductosFrescos - Fecha de Embasado: " + fechaEnvasado + ", Pais de Origen: " + paisOrigen;
	}
	
	
	
	
}
