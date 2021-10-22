import biblioteca.Biblioteca;
import lector.Lector;
import libro.Libro;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBiblioteca {
    private List<Libro> libros = new ArrayList<Libro>();

    @BeforeClass
    public void TestBiblioteca() {
        for(int i = 0; i < 10; i++) {
            this.libros.add(new Libro("some name " + String.valueOf(i),"some name " + String.valueOf(i),"some name " + String.valueOf(i),"some name " + String.valueOf(i)  ));
        }
    }

    @Test
    public void TestAnadirLibros() {
        Biblioteca newBiblioteca = new Biblioteca();
        newBiblioteca.setTotalLibros(this.libros);
        Assert.assertEquals(this.libros.size(), newBiblioteca.getTotalLibros().size());
    }

    @Test
    public void TestLectores() {
        Biblioteca newBiblioteca = new Biblioteca();

    }

}
