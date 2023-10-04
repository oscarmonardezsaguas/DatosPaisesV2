package Controlador.negocio;

import Controlador.Pais;
import Modelo.PaisDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PaisNegocio {
    private final PaisDAO DATOS;
    private Pais obj;
    private DefaultTableModel modeloTable;

    public PaisNegocio() {
        this.DATOS = new PaisDAO();
        this.obj = new Pais();
    }
    
    public DefaultTableModel listar(String texto) {
        List<Pais> lista=new ArrayList();
        lista.addAll(DATOS.listar(texto));        
        
        String[] titulos={"Código", "Nombre" ,"Continente"};
        this.modeloTable=new DefaultTableModel(null, titulos);

          String[] registro=new String[3];
        
        for (Pais item:lista){        
            //registro[0]item.getCodigoPais();
            registro[1]=item.getNombre();
            registro[2]=item.getContinente();  
            this.modeloTable.addRow(registro);
        }
        return this.modeloTable;
    }
    
}
    
    
   

    
    
   
