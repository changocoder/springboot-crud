package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Producto;

import java.util.List;

public interface ProductoService {

    public Producto createProducto(Producto producto);
    public Producto updateProducto(Producto emp);
    public Producto getProducto(Long empId);
    public void deleteProducto(Long empId);
    public List <Producto> getAllProducto();
}
