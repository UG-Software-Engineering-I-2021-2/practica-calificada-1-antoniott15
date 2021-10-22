package biblioteca;

import lector.Lector;
import libro.Libro;

import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<Libro> totalLibros;
    private Map<String, Lector> lectores;


    public String prestarLibro(String nombreLibro, Lector lector) {
        Libro libroSelected = new Libro("", "","","");
        for (Libro libro : this.totalLibros) {
            if(libro.getLibroNombre().equals(nombreLibro)) {
                libroSelected = libro;
            }
        }

        if(libroSelected.getLibroNombre().length() == 0) {
            return "No libro encontrado con ese nombre";
        }

        if(!libroSelected.getStatus().equals("habilitado") || libroSelected.getStatus().equals("prestado")) {
            return "el libro no se encuentra disponible";
        }

        String lectorRespuesta = lector.anadirNuevoLibro(libroSelected);
        if(lectorRespuesta.equals("Este usuario no puede tener mas libros")) {
            return lectorRespuesta;
        }

        this.lectores.put(libroSelected.getIdentificador(), lector);

        int indexSelected = this.totalLibros.indexOf(libroSelected);
        libroSelected.setStatus("prestado");
        this.totalLibros.set(indexSelected, libroSelected);

        return "Se ha prestado el libro correctamente";
    }
    public List<Libro> getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(List<Libro> totalLibros) {
        this.totalLibros = totalLibros;
    }

    public Map<String, Lector> getLectores() {
        return lectores;
    }

    public void setLectores(Map<String, Lector> lectores) {
        this.lectores = lectores;
    }
}
