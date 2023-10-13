package Negocio;

public class PaisNegocio {
     //atributos
    private String nombre;
    private String continente;   
    private int codigoPais;  
    private int poblacion;

    public PaisNegocio() {
    }
    
    // metodo cuando se intenta insertar los datos
    public String insertar( int codigoPais,String nombre, String continente, int poblacion){
        if (poblacion>0) {
            return "OK";
        }else{          
            return "";
        }
    }
    
   
}
