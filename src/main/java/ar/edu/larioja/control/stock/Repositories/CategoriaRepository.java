package ar.edu.larioja.control.stock.Repositories;

import ar.edu.larioja.control.stock.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {

    void save (Optional<Categoria> categoria);
    }


