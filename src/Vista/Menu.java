package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.ActionListener;


import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       eventosmenu();       
    }
      
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jAcceso = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMnPaises = new javax.swing.JMenuItem();
        jMnCiudades = new javax.swing.JMenuItem();
        jMnIdiomas = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu2.setText("Acceso");

        jAcceso.setText("Acceso");
        jAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccesoActionPerformed(evt);
            }
        });
        jMenu2.add(jAcceso);
        jMenu2.add(jSeparator1);

        jExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jExit.setText("Salir");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jMenu2.add(jExit);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Maestros");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMnPaises.setText("Pais");
        jMnPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnPaisesActionPerformed(evt);
            }
        });
        jMenu3.add(jMnPaises);

        jMnCiudades.setText("Ciudades");
        jMenu3.add(jMnCiudades);

        jMnIdiomas.setText("Idioma");
        jMenu3.add(jMnIdiomas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
           cerrar();
    }//GEN-LAST:event_jExitActionPerformed

    private void jAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccesoActionPerformed
        Menu menu = new Menu();
        JOptionPane.showMessageDialog(menu, "Acceso al sistema");
    }//GEN-LAST:event_jAccesoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMnPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnPaisesActionPerformed
          //VistaPais vistapais = new VistaPais();
          //vistapais.setVisible (true);       
    }//GEN-LAST:event_jMnPaisesActionPerformed

   // metodo para salir   del jframe menu
     public void cerrar(){
              int opcion = 0;
            opcion = JOptionPane.showConfirmDialog(this,
                    "¿Seguro que desea cerrar el programa?", "Aviso",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);

            switch (opcion) {
                case JOptionPane.YES_OPTION:
                    System.exit(0);
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                case JOptionPane.CLOSED_OPTION:
                    break;
                default:
                    break;
            }
     }
     
      
        
     
     // evento opciones del menu
    private void eventosmenu(){
        // Evento de tipo listener del menu Paises
        ActionListener oyentePais = new ActionListener() {
      
            @Override
        public void actionPerformed(ActionEvent e) {
            VistaPais vistapais = new VistaPais();
            vistapais.setVisible (true);       
            }
        };     
        jMnPaises.addActionListener(oyentePais);               
              
        
        // Evento de tipo listener del menu Ciudades
        ActionListener oyenteCiudad = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaCiudad vistaciudad = new VistaCiudad();
                vistaciudad.setVisible (true);           
            }
        };      
         jMnCiudades.addActionListener(oyenteCiudad);
        
          // Evento de tipo listener del menu Ciudades
        ActionListener oyenteIdioma = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaIdioma vistaidioma = new VistaIdioma();
                vistaidioma.setVisible (true);                
            }
        };      
         jMnIdiomas.addActionListener(oyenteIdioma);
    }
    
     
             

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAcceso;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMnCiudades;
    private javax.swing.JMenuItem jMnIdiomas;
    private javax.swing.JMenuItem jMnPaises;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
