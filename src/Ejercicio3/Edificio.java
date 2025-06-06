package Ejercicio3;

public abstract class Edificio {
	
	// Atributos 
	public double superfice;
	
	// Constructores
	public Edificio() {
	}
	
	public Edificio(double superfice) {
		this.superfice = superfice;
	}

	// Gets & Sets
	public double getSuperfice() {
		return superfice;
	}
	
	public void setSuperfice(double superfice) {
		this.superfice = superfice;
	}
	
	// Metodos
	public abstract double getSuperficieEdificio();

	@Override
	public String toString() {
		return "El Edificio [superfice=" + superfice + "]";
	}
}
