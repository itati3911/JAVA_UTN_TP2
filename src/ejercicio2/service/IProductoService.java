package ejercicio2.service;

import ejercicio2.domain.Producto;
import ejercicio2.utils.TipoProductoEnum;

public interface IProductoService {
	Producto CargarNuevoProducto(TipoProductoEnum tipoProducto);
}
