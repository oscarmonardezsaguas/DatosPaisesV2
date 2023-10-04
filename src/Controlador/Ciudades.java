package Controlador;

public class Ciudades  extends Pais{

//atributos
private String nombreCiudad;
private String paisPertenece;
private String distrito;
private int poblacionCiudad;

    //Constructores
    public Ciudades(String nombreCiudad, String paisPertenece, String distrito, int poblacionCiudad) {
        this.nombreCiudad = nombreCiudad;
        this.paisPertenece = paisPertenece;
        this.distrito = distrito;
        this.poblacionCiudad = poblacionCiudad;
    }

    public Ciudades( String nombreCiudad, String paisPertenece, String distrito, int poblacionCiudad, String nombre, String continente, String region, Double superficie, int anoIndependencia, int poblacion, int expectativaVida, Double productoNB, String formaGobierno, String jefeEstado, String ciudadCapital, int codigoPais, String idiomaPais) {
        super(nombre, continente, region, superficie, anoIndependencia, poblacion, expectativaVida, productoNB, formaGobierno, jefeEstado, ciudadCapital, codigoPais, idiomaPais);
        this.nombreCiudad = nombreCiudad;
        this.paisPertenece = paisPertenece;
        this.distrito = distrito;
        this.poblacionCiudad = poblacionCiudad;
    }


//Getters y Setters
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getPaisPertenece() {
        return paisPertenece;
    }

    public void setPaisPertenece(String paisPertenece) {
        this.paisPertenece = paisPertenece;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getPoblacionCiudad() {
        return poblacionCiudad;
    }

    public void setPoblacionCiudad(int poblacionCiudad) {
        this.poblacionCiudad = poblacionCiudad;
    }

    @Override
    public String toString() {
        return "Ciudades{" + "nombreCiudad=" + nombreCiudad + ", paisPertenece=" + paisPertenece + ", distrito=" + distrito + ", poblacionCiudad=" + poblacionCiudad + '}';
    }
 
    
}
