package ar.edu.larioja.control.stock.Controllers;


import ar.edu.larioja.control.stock.Models.Categoria;
import org.springframework.web.bind.annotation.PathVariable;
import ar.edu.larioja.control.stock.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria/v1")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(produces="application/json",path = "/")
    public ResponseEntity<String> HelloWorld(){

        return new ResponseEntity<>("Hello World!!", HttpStatus.OK );

    }

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/add")
    public ResponseEntity<Categoria> agregarCategoria(@RequestBody Categoria categoria){

        return new ResponseEntity <> ( categoriaService.createCategoria ( categoria ), HttpStatus.CREATED);
    }

    @GetMapping(produces = "application/json",path = "/all")
    public ResponseEntity<List<Categoria>> getAllCategorias(){

        return new ResponseEntity <> ( categoriaService.getAllCategoria (), HttpStatus.OK );


    }

    @GetMapping(path = "/{categoriaId}", produces = "application/json")
    public ResponseEntity<Categoria> getEmployee(@PathVariable(value = "categoriaId") Long categoriaId) {
        return new ResponseEntity<>(categoriaService.getCategoria (categoriaId), HttpStatus.OK);
    }



}
