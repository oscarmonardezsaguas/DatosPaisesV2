package Controlador;

public class Idioma extends Pais {
  //atributos
    private String idioma;
    private boolean oficial;
    private Double porcentaje;

    //constructor
    public Idioma(String idioma, boolean oficial, Double porcentaje) {
        this.idioma = idioma;
        this.oficial = oficial;
        this.porcentaje = porcentaje;
    }

    public Idioma(String idioma, boolean oficial, Double porcentaje, String nombre, String continente, String region, Double superficie, int anoIndependencia, int poblacion, int expectativaVida, Double productoNB, String formaGobierno, String jefeEstado, String ciudadCapital, int codigoPais, String idiomaPais) {
        super(nombre, continente, region, superficie, anoIndependencia, poblacion, expectativaVida, productoNB, formaGobierno, jefeEstado, ciudadCapital, codigoPais, idiomaPais);
        this.idioma = idioma;
        this.oficial = oficial;
        this.porcentaje = porcentaje;
    }

    //Getters y Setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isOficial() {
        return oficial;
    }

    public void setOficial(boolean oficial) {
        this.oficial = oficial;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Idioma{" + "idioma=" + idioma + ", oficial=" + oficial + ", porcentaje=" + porcentaje + '}';
    }
    
    
}
