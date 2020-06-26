package ar.edu.larioja.control.stock.Models;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Marca")
    private String marca;
    @Column(name = "NumeroSerie")
    private String numeroSerie;



    @ManyToOne
    @JoinColumn(name = "Categoria_Id", nullable = false, updatable = false)
    private Categoria categoria;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
