package ar.edu.larioja.control.stock.Repositories;

import ar.edu.larioja.control.stock.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository  extends JpaRepository<Producto,Long> {
}
