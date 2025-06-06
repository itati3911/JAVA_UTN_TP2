package ejercicio2.domain;

public class ProductosCongelados extends Producto{
	
	private float temperaturaCongelacionRec;
	
	public ProductosCongelados() {
		super();
	
	}

	public ProductosCongelados(float temperaturaCongelacionRec) {
		super();
		this.temperaturaCongelacionRec = (temperaturaCongelacionRec > 0) ? temperaturaCongelacionRec * -1 : temperaturaCongelacionRec;
	}


	public float getTemperaturaCongelacionRec() {
		return temperaturaCongelacionRec;
	}


	public void setTemperaturaCongelacionRec(float temperaturaCongelacionRec) {
		this.temperaturaCongelacionRec = (temperaturaCongelacionRec > 0) ? temperaturaCongelacionRec * -1 : temperaturaCongelacionRec;
	}


	@Override
	public String toString() {
		return super.toString() + "ProductosCongelados - Temperatura de Congelacion recomendada: " + temperaturaCongelacionRec;
	}
	

}
