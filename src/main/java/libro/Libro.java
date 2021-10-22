package libro;

import java.security.SecureRandom;

public class Libro {
    private String autorNombre;
    private String libroAnoPublication;
    private String libroNombre;
    private String autorFechaNacimiento;
    private String identificador;
    private String status;
    private SecureRandom rand = new SecureRandom();


    public  Libro(String autorNombre,String autorFechaNacimiento, String anoPublication, String libroNombre) {
        this.autorNombre = autorNombre;
        this.autorFechaNacimiento = autorFechaNacimiento;
        this.libroAnoPublication = anoPublication;
        this.libroNombre = libroNombre;
        this.status = "habilitado";
        this.identificador = String.valueOf(this.rand.nextInt(Integer.MAX_VALUE));
    }

    public String getAutorNombre() {
        return autorNombre;
    }

    public void setAutorNombre(String autorNombre) {
        this.autorNombre = autorNombre;
    }

    public String getLibroAnoPublication() {
        return libroAnoPublication;
    }

    public void setLibroAnoPublication(String libroAnoPublication) {
        this.libroAnoPublication = libroAnoPublication;
    }

    public String getLibroNombre() {
        return libroNombre;
    }

    public void setLibroNombre(String libroNombre) {
        this.libroNombre = libroNombre;
    }

    public String getAutorFechaNacimiento() {
        return autorFechaNacimiento;
    }

    public void setAutorFechaNacimiento(String autorFechaNacimiento) {
        this.autorFechaNacimiento = autorFechaNacimiento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
