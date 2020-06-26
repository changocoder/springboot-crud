package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Categoria;

import java.util.List;

public interface CategoriaService {


    public Categoria createCategoria(Categoria Categoria);
    public Categoria updateCategoria(Categoria emp);
    public Categoria getCategoria(Long empId);
    public void deleteCategoria(Long empId);
    public List <Categoria> getAllCategoria();
}
