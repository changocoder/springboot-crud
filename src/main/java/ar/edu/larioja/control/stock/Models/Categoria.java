package ar.edu.larioja.control.stock.Models;

import org.omg.PortableInterceptor.INACTIVE;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "Descripcion")
    private String Descripcion;

    @Column(name = "Nombre")
    private String Nombre;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
