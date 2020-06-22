package ar.edu.larioja.control.stock.Controllers;


import ar.edu.larioja.control.stock.Models.Categoria;
import ar.edu.larioja.control.stock.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api/")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping(path = "/api")
    public @ResponseBody String HelloWorld(){

        return "Hola Mundo";

    }

    @PostMapping(path = "/add")
    public @ResponseBody String agregarCategoria(@RequestParam String nombre){

        Categoria categoria = new Categoria ();

        categoria.setNombre (nombre);
        try {
            categoriaRepository.save(categoria);
        }catch (Exception ex){
            System.out.println (ex);
        }


        return "Categoria Guardada";

    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Categoria> getAllCategorias(){

        return categoriaRepository.findAll();


    }



}
