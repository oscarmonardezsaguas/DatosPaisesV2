package Vista;

import Controlador.Pais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaPais extends javax.swing.JFrame {
    private int codigo = 0;
    private String nombrePais = "";
    private String continente = "";
    private int poblacion = 0;
    ArrayList<Pais> lista = new ArrayList<>();
        
    //private final PaisNegocio CONTROL;
      
    // CONSTRUCTOR
    public VistaPais() {
        initComponents();
        //this.CONTROL=new PaisNegocio();
        eventosBotones();       
               
         tablaListado.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            public void mouseClicked(MouseEvent e) {
                int i = tablaListado.getSelectedRow();
                codigo = Integer.parseInt((tablaListado.getValueAt(i, 0).toString()));
                nombrePais = (tablaListado.getValueAt(i, 1).toString());
                continente = (tablaListado.getValueAt(i, 2).toString());
                poblacion = Integer.parseInt((tablaListado.getValueAt(i, 3).toString()));              
                txtId.setText(String.valueOf(codigo));
            }
        });
        
    }

    //private void listar(String texto){
       // tablaListado.setModel(this.CONTROL.listar(texto));    
    //


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxContinente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPoblacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTextoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Poblacional Internacional");
        setLocationByPlatform(true);
        setResizable(false);

        btnCrear.setText("Agregar");
        btnCrear.setName("btnCrear"); // NOI18N

        btnEliminar.setText("Eliminar");

        btnModificar.setText("Modificar");

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaListado.setColumnSelectionAllowed(true);
        tablaListado.setName("tabla"); // NOI18N
        tablaListado.setRowSelectionAllowed(false);
        tablaListado.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tablaListado);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Código (*)");

        jLabel3.setText("Nombre (*)");

        jLabel4.setText("Continente (*)");

        cbxContinente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asia", "America", "Africa", "Antartida", "Europa", "Oceania" }));

        jLabel5.setText("Población");

        jLabel6.setText("(*) Indica que es un campo obligatorio.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPoblacion, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(cbxContinente, 0, 212, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtCodigo)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbxContinente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jLabel7.setText("Buscar :");

        btnBuscar.setText("Buscar");
        btnBuscar.setName("btnBuscar"); // NOI18N

        jLabel8.setText("Código Seleccionado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(txtTextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
       
    
    // metodo evento botones
    private void eventosBotones(){
         // evento action listener del boton buscar
         ActionListener oyenteBuscar=new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   JOptionPane.showMessageDialog(null,
                         "Estoy buscando paises...","Sistema", JOptionPane.WARNING_MESSAGE);
             }
          };
         btnBuscar.addActionListener(oyenteBuscar);
           
       // evento action listener del boton agregar
       ActionListener oyenteAgregar = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 crearDatos();
             }
          };
          btnCrear.addActionListener(oyenteAgregar);
       
      
         
        
    }
              
    // Metodo crear datos 
    private void crearDatos(){
        // validar que codigo no este vacio
         if (txtCodigo.getText().length()==0 || txtCodigo.getText().length()>100){
            JOptionPane.showMessageDialog(this, "Debes ingresar un código, es obligatorio.","Sistema", JOptionPane.WARNING_MESSAGE);
            txtCodigo.requestFocus();
            return;
        }
       
        // validar que nombre no este vacio
        if (txtNombre.getText().length()==0 || txtNombre.getText().length()>100){
            JOptionPane.showMessageDialog(this, "Debes ingresar un nombre, es obligatorio.","Sistema", JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocus();
            return;
        }
        
        // validar que poblacion no este vacio
        if (txtPoblacion.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Debes ingresar una población, es obligatorio.","Sistema", JOptionPane.WARNING_MESSAGE);
            txtPoblacion.requestFocus();
            return;
        }
       
          if(JOptionPane.showConfirmDialog(this,"Deseas guardar el registro ?",
                  "Guardar", JOptionPane.YES_NO_OPTION)==0){
               
                //leer los text de nuestro jframe
                int codigo = Integer.parseInt(txtCodigo.getText());
                String nombre = txtNombre.getText();
                String continente = cbxContinente.getSelectedItem().toString();           
                int poblacion = Integer.parseInt(txtPoblacion.getText());
                
                // instacioamos la clase pais y pasamos los parametros
                Pais pais = new Pais(codigo, nombre, continente, poblacion);
                
                // agregara alista el registro
                lista.add(pais);
                
                // mostramos el registro en la tabla
                mostrarDatos();
                txtCodigo.setText("");
                txtNombre.setText("");                
                txtPoblacion.setText("");
            }
       }
       
        //Metodo mostrar datos
     private void mostrarDatos() {
        String matriz[][] = new String[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            matriz[i][0] = String.valueOf(lista.get(i).getCodigoPais());
            matriz[i][1] = lista.get(i).getNombre();
            matriz[i][2] = lista.get(i).getContinente();
            matriz[i][3] = String.valueOf(lista.get(i).getPoblacion());
        }
       tablaListado.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Código", "Nombre", "Continente", "Población"}));
     }
     
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxContinente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtTextoBuscar;
    // End of variables declaration//GEN-END:variables
}
