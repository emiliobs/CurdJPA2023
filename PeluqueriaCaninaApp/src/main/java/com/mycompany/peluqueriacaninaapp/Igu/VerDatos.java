package com.mycompany.peluqueriacaninaapp.Igu;

import com.mycompany.peluqueriacaninaapp.Logica.Controladora;
import com.mycompany.peluqueriacaninaapp.Logica.Mascota;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame
{

    Controladora controladora = null;

    public VerDatos()
    {

        initComponents();

        controladora = new Controladora();
        CargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVerDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btbEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblVerDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        jScrollPane1.setViewportView(tblVerDatos);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setText("Datos de Mascotas:");

        btbEliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btbEliminar.setIcon(new javax.swing.ImageIcon("C:\\JavaPorjects\\CurdJPA2023\\PeluqueriaCaninaApp\\utilidades\\appimg\\icons8-basura-llena-48.png")); // NOI18N
        btbEliminar.setText("Eliminar");
        btbEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btbEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\JavaPorjects\\CurdJPA2023\\PeluqueriaCaninaApp\\utilidades\\appimg\\icons8-editar-48.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\JavaPorjects\\CurdJPA2023\\PeluqueriaCaninaApp\\utilidades\\appimg\\icons8-salir-48.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(357, 357, 357))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        CargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btbEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btbEliminarActionPerformed
    {//GEN-HEADEREND:event_btbEliminarActionPerformed
        try
        {
            //Controlo que la tabla no este vacia
            if (tblVerDatos.getRowCount() > 0)
            {
                //Controlo que se haya seleccionado un datos:
                if (tblVerDatos.getSelectedRow() != -1)
                {
                    //Aqui obtengo la ID del dato a eliminas
                    ImageIcon icon = new ImageIcon("C:/JavaPorjects/CurdJPA2023/PeluqueriaCaninaApp/utilidades/appimg/trashcan.png");
                    int salida = JOptionPane.showConfirmDialog(null,"Desea Mascota Mascota?", "Borrar Mascota",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, icon);
                    if (salida == 0)
                    {
                     
                     controladora.BorrarMascotaPorId(Integer.parseInt(String.valueOf(tblVerDatos.getValueAt(tblVerDatos.getSelectedRow(), 0))));
                     MostrarMensajes("Mascota eliminado de forma correcta", "Informacion", "Borrando Dato");
                    }
                    else
                    {
                         CargarTabla();
                    }
                            
                                     
        
                   // MostrarMensajes("Mascota eliminado de forma correcta", "Informacion", "Borrando Dato");
                    CargarTabla();

                }
                else
                {
                    MostrarMensajes("No ha seleccionodo dato a Eliminar", "Error", "Error: Dato no Seleccionado");

                }

            }
            else
            {
                MostrarMensajes("No existe Dato a Eliminar", "Error", "Error: Tabla sin Dato");
            }

        }
        catch (NumberFormatException e)
        {
            System.out.println("ERROR (Eliminar en Ver Datos): " + e.getMessage());
        }

    }//GEN-LAST:event_btbEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        try
        {
            if (tblVerDatos.getRowCount() > 0)
            {
                if (tblVerDatos.getSelectedRow() != -1)
                {
                   int numCliente = Integer.parseInt(String.valueOf(tblVerDatos.getValueAt(tblVerDatos.getSelectedRow(),0)));
                   
                   ModificarDatos modificarDatos = new ModificarDatos(numCliente);
                   modificarDatos.setVisible(true);
                   modificarDatos.setLocationRelativeTo(null);
                   
                     dispose();
                                             
                }
                else
                {
                    MostrarMensajes("No ha seleccionado dato a Editar", "Error", "Error: Dato no seleccionado");
                }
            }
            else
            {
                MostrarMensajes("NO existe Datos a Editar", "Error", "Error: Tabla sin Datos");
            }
            
          
        }
        catch (Exception e)
        {
            System.out.println("ERROR: (Editar en Ver Datos.)" + e.getMessage());
        }


    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbEliminar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVerDatos;
    // End of variables declaration//GEN-END:variables

    public void MostrarMensajes(String mensaje, String tipo, String titulo)
    {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Informacion"))
        {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        }
        else if (tipo.equals("Error"))
        {

            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

    public void CargarTabla()
    {
        try
        {
            //Definir el Modelo que tenga la Tabla:
            DefaultTableModel defaultTableModel = new DefaultTableModel()
            {
                //Que las filas y las columnas sean fijas no editables.

                @Override
                public boolean isCellEditable(int row, int column)
                {
                    return false;
                }
            };

            //Establecemos los nombres de la columnas:
            String titulos[] =
            {
                "Num. Cliente",
                "Nombre",
                "Raza",
                "Color",
                "Alegico",
                "At. Especial",
                "Dueño",
                "Celular",
                "Observaciones"
            };

            defaultTableModel.setColumnIdentifiers(titulos);

            //Cargar los datos de la Base de datos:
            List<Mascota> listaMascotas = controladora.TraerMascotas();

            //Recorrer la lsita y mostrar cada elemento de los elementos en la lista:
            if (listaMascotas != null)
            {
                for (Mascota mascotas : listaMascotas)
                {
                    Object[] objecto =
                    {
                        mascotas.getNumeroCliente(),
                        mascotas.getNombre(),
                        mascotas.getRaza(),
                        mascotas.getColor(),
                        mascotas.getAlergico(),
                        mascotas.getAtencionEspecial(),
                        mascotas.getUnDuenio().getNombre(),
                        mascotas.getUnDuenio().getCelularDelDuenio(),
                        mascotas.getObservaciones()
                    };

                    defaultTableModel.addRow(objecto);
                }
            }

            tblVerDatos.setModel(defaultTableModel);

            //System.out.println("Datos Mostrados");
        }
        catch (Exception e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
