package database;

public class PruebaConexion {
    public static void main(String[] args) {
        Conexion con=new Conexion();
        con.conectar();
        if (con.cadena!=null){
            System.out.println("Conectado");
        } else{
            System.out.println("Desconectado");
        }      
    }
}
