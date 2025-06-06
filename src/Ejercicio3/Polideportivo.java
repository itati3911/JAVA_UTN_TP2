package Ejercicio3;

public class Polideportivo extends Edificio implements I_InstalacionDeportiva {
	
	// Atributos
	
	private String nombre;
	private int tipoInstalacion; 
	
	// Consturctores
	
	public Polideportivo()
	{
		
	}

	public Polideportivo(double superfice, String nombre) {
		super(superfice);
		this.nombre = nombre;
	}


	// Gets & Sets:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTipoInstalacion() {
		return tipoInstalacion;
	}
	
	// Override
	
	@Override
	public int getTipoDeInstalacion() {
		return tipoInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		return this.getSuperfice();
	}

	@Override
	public String toString() {
		return "El " + nombre + " tiene una superficie de " + this.getSuperficieEdificio()+" metros cuadrados.";
	}


}
