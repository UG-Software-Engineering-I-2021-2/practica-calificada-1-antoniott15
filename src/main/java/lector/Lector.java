package lector;

import libro.Libro;

import java.time.LocalDate;
import java.util.Map;

public class Lector {
    private String nombre;
    private Map<Libro, LocalDate> libros;

    public Lector(String nombre) {
        this.nombre = nombre;
    }

    public String anadirNuevoLibro(Libro libro) {
        if(this.libros.size() > 3) {
            return "Este usuario no puede tener mas libros";
        }
        this.libros.put(libro, LocalDate.now());
        return "Nuevo libro añadido con el nombre: " + libro.getLibroNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Libro, LocalDate> getLibros() {
        return libros;
    }

    public void setLibros(Map<Libro, LocalDate> libros) {
        this.libros = libros;
    }
}
