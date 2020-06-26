package ar.edu.larioja.control.stock.Controllers;


import ar.edu.larioja.control.stock.Models.Producto;
import ar.edu.larioja.control.stock.Repositories.ProductoRepository;
import ar.edu.larioja.control.stock.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto/v1")
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @GetMapping(produces = "application/json", path = "/all")
    public ResponseEntity<List<Producto>> getAllProductos(){

        return new ResponseEntity <> ( productoService.getAllProducto (), HttpStatus.OK );

    }

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/add")
    public ResponseEntity<Producto> createProducto(@RequestBody Producto producto){

        return new ResponseEntity <> ( productoService.createProducto ( producto ), HttpStatus.CREATED );
    }




}
