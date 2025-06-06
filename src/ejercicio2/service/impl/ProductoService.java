package ejercicio2.service.impl;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import ejercicio2.domain.Producto;
import ejercicio2.domain.ProductosCongelados;
import ejercicio2.domain.ProductosFrescos;
import ejercicio2.domain.ProductosRefrigerados;
import ejercicio2.service.IProductoService;
import ejercicio2.utils.TipoProductoEnum;

public class ProductoService implements IProductoService {

		
	@Override
	public Producto CargarNuevoProducto(TipoProductoEnum tipoProducto) {
		Producto nuevoProducto = new Producto();
		
		switch(tipoProducto.GetTipoProducto()) {
		case 1:
			nuevoProducto = CrearNuevoProductoCongelado();
			break;
		case 2:
			nuevoProducto = CrearNuevoProductoFresco();
			break;
		case 3:
			nuevoProducto = CrearNuevoProductoRefrigerado();
			break;
		default:
			break;
		}
		
		return nuevoProducto;
	}
	
	private ProductosCongelados CrearNuevoProductoCongelado() {
		ProductosCongelados nuevoProductoCongelado = new ProductosCongelados();
		var fechaCaducidad = LocalDate.of(2027, 11, 12);
		
		nuevoProductoCongelado.setFechaCaducidad(fechaCaducidad);
		nuevoProductoCongelado.setNombre("Arvejas congeladas");
		nuevoProductoCongelado.setNumeroLote(12);
		nuevoProductoCongelado.setTemperaturaCongelacionRec(-18);
		nuevoProductoCongelado.setTipoProducto(TipoProductoEnum.ProductoCongelado);
		
		return nuevoProductoCongelado;
	}
	
	private ProductosFrescos CrearNuevoProductoFresco() {
		ProductosFrescos nuevoProductoFresco = new ProductosFrescos();
		var fechaEnvasado = LocalDate.of(2025, 02, 02);
		var fechaCaducidad = LocalDate.of(2025, 11, 11);
		
		nuevoProductoFresco.setFechaCaducidad(fechaCaducidad);
		nuevoProductoFresco.setFechaEnvasado(fechaEnvasado);
		nuevoProductoFresco.setNombre("Queso fresco");
		nuevoProductoFresco.setNumeroLote(10003);
		nuevoProductoFresco.setPaisOrigen("Argentina");
		nuevoProductoFresco.setTipoProducto(TipoProductoEnum.ProductoFresco);
		
		return nuevoProductoFresco;
	}
	
	private ProductosRefrigerados CrearNuevoProductoRefrigerado() {
		ProductosRefrigerados nuevoProductoRefrigerado = new ProductosRefrigerados();
		var fechaCaducidad = LocalDate.of(2026, 3, 10);
		
		nuevoProductoRefrigerado.setCodOrganismo(3001);
		nuevoProductoRefrigerado.setFechaCaducidad(fechaCaducidad);
		nuevoProductoRefrigerado.setNombre("Juego de naranja");
		nuevoProductoRefrigerado.setNumeroLote(5001);
		nuevoProductoRefrigerado.setTipoProducto(TipoProductoEnum.ProductoRefrigerado);
		
		return nuevoProductoRefrigerado;
	}
	
	

}
