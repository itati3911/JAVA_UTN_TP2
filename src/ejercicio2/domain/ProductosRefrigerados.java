package ejercicio2.domain;

public class ProductosRefrigerados extends Producto{
	
	private int codOrganismo;

	
	public ProductosRefrigerados() {
		super();
	}
	
	public ProductosRefrigerados(int codOrganismo) {
		super();
		this.codOrganismo = codOrganismo;
	}

	
	public int getCodOrganismo() {
		return codOrganismo;
	}

	public void setCodOrganismo(int codOrganismo) {
		this.codOrganismo = codOrganismo;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductosRefrigerados [codOrganismo=" + codOrganismo + "]";
	}
		
	
}
