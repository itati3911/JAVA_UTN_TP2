package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import ejercicio2.domain.Producto;
import ejercicio2.service.IProductoService;
import ejercicio2.service.impl.ProductoService;
import ejercicio2.utils.TipoProductoEnum;

public class Principal {
	
	private IProductoService _productosService;
	
	public Principal(IProductoService productoService){
		this._productosService = productoService;
	}
	
	private void ejecutarEjercicio() {
		List<Producto> listadoProductos = new ArrayList<Producto>();

		listadoProductos.add(_productosService.CargarNuevoProducto(TipoProductoEnum.ProductoCongelado));
		listadoProductos.add(_productosService.CargarNuevoProducto(TipoProductoEnum.ProductoFresco));
		listadoProductos.add(_productosService.CargarNuevoProducto(TipoProductoEnum.ProductoRefrigerado));
		
		for(Producto producto : listadoProductos) {
			producto.MostrarProducto();
		}
		
	}

	public static void main(String[] args) {
		IProductoService productoService = new ProductoService();
        Principal principal = new Principal(productoService);
        
        principal.ejecutarEjercicio();		
	}

}
