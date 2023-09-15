package Controlador;

public class Pais {
    //atributos
    private String nombre;
    private String continente;
    private String region;
    private Double superficie;
    private int anoIndependencia;
    private int poblacion;
    private int expectativaVida;
    private Double productoNB;
    private String formaGobierno;
    private String jefeEstado;
    private String ciudadCapital;
    private String codigoPais;
    private String idiomaPais;

    //constructor vacio
    public Pais() {
    }

    //Constructor 
    public Pais(String nombre, String continente, String region, Double superficie, int anoIndependencia, int poblacion, int expectativaVida, Double productoNB, String formaGobierno, String jefeEstado, String ciudadCapital, String codigoPais, String idiomaPais) {
        this.nombre = nombre;
        this.continente = continente;
        this.region = region;
        this.superficie = superficie;
        this.anoIndependencia = anoIndependencia;
        this.poblacion = poblacion;
        this.expectativaVida = expectativaVida;
        this.productoNB = productoNB;
        this.formaGobierno = formaGobierno;
        this.jefeEstado = jefeEstado;
        this.ciudadCapital = ciudadCapital;
        this.codigoPais = codigoPais;
        this.idiomaPais = idiomaPais;
    }

 // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public int getAnoIndependencia() {
        return anoIndependencia;
    }

    public void setAnoIndependencia(int anoIndependencia) {
        this.anoIndependencia = anoIndependencia;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getExpectativaVida() {
        return expectativaVida;
    }

    public void setExpectativaVida(int expectativaVida) {
        this.expectativaVida = expectativaVida;
    }

    public Double getProductoNB() {
        return productoNB;
    }

    public void setProductoNB(Double productoNB) {
        this.productoNB = productoNB;
    }

    public String getFormaGobierno() {
        return formaGobierno;
    }

    public void setFormaGobierno(String formaGobierno) {
        this.formaGobierno = formaGobierno;
    }

    public String getJefeEstado() {
        return jefeEstado;
    }

    public void setJefeEstado(String jefeEstado) {
        this.jefeEstado = jefeEstado;
    }

    public String getCiudadCapital() {
        return ciudadCapital;
    }

    public void setCiudadCapital(String ciudadCapital) {
        this.ciudadCapital = ciudadCapital;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getIdiomaPais() {
        return idiomaPais;
    }

    public void setIdiomaPais(String idiomaPais) {
        this.idiomaPais = idiomaPais;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", continente=" + continente + ", region=" + region + ", superficie=" + superficie + ", anoIndependencia=" + anoIndependencia + ", poblacion=" + poblacion + ", expectativaVida=" + expectativaVida + ", productoNB=" + productoNB + ", formaGobierno=" + formaGobierno + ", jefeEstado=" + jefeEstado + ", ciudadCapital=" + ciudadCapital + ", codigoPais=" + codigoPais + ", idiomaPais=" + idiomaPais + '}';
    }
    
    
    
}
