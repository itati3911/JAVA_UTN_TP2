package Ejercicio3;

public class EdificioOficinas extends Edificio{

	//Atributos
	
	private int numeroOficinas;

	//Constructores
	
	EdificioOficinas()
	{
		
	}
		
	public EdificioOficinas(double superfice, int numeroOficinas) {
		super(superfice);
		this.numeroOficinas = numeroOficinas;
	}

	//Gets & Sets
	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

	//Override
	
	@Override
	public double getSuperficieEdificio() {
		return this.getSuperfice();
	}

	//método toString para número de oficinas y superficie o número de oficinas sólo.
	@Override
	public String toString() {
		return "El Edificio de oficinas tiene una superficie de " + superfice +" metros cuadrados y " + numeroOficinas + " oficinas.";
		//return "El Edificio de oficinas tiene " + numeroOficinas + " oficinas.";

	}
	
	
	
}
