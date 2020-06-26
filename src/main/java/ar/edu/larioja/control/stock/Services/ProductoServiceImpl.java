package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Producto;
import ar.edu.larioja.control.stock.Repositories.CategoriaRepository;
import ar.edu.larioja.control.stock.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Producto createProducto(Producto producto) {

        return productoRepository.save (producto);
    }

    @Override
    public List <Producto> getAllProducto() {
        return productoRepository.findAll ();
    }

    @Override
    public void deleteProducto(Long empId) {

    }

    @Override
    public Producto getProducto(Long empId) {
        return null;
    }

    @Override
    public Producto updateProducto(Producto emp) {
        return null;
    }
}
