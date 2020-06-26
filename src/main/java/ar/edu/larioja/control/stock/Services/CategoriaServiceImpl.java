package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Categoria;
import ar.edu.larioja.control.stock.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Override
    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepository.save ( categoria );
    }

    @Override
    public Categoria updateCategoria(Categoria emp) {
        return null;
    }

    @Override
    public Categoria getCategoria(Long Id) {

        Optional<Categoria> optionalCat = categoriaRepository.findById(Id);
        if (optionalCat.isPresent()) {
            return optionalCat.get();
        }
        return null;
    }

    @Override
    public void deleteCategoria(Long empId) {

    }

    @Override
    public List <Categoria> getAllCategoria() {
        return categoriaRepository.findAll ();
    }
}
