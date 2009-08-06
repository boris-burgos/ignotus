/*
 * PanelRendererLibroTurboISBN.java
 *
 * Created on 17 de abril de 2008, 21:51
 */

package com.codeko.apps.campanilla.ignotus.turbomagia;

import com.codeko.apps.campanilla.ignotus.Libro;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author  campa
 */
public class PanelRendererLibroTurboISBN extends javax.swing.JPanel implements ListCellRenderer {
    
    /** Creates new form PanelRendererLibroTurboISBN */
    public PanelRendererLibroTurboISBN() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCodigo = new javax.swing.JLabel();
        lPropietario = new javax.swing.JLabel();
        lTags = new javax.swing.JLabel();
        lISBN = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.codeko.apps.campanilla.ignotus.IgnotusApp.class).getContext().getResourceMap(PanelRendererLibroTurboISBN.class);
        lCodigo.setText(resourceMap.getString("lCodigo.text")); // NOI18N
        lCodigo.setName("lCodigo"); // NOI18N

        lPropietario.setText(resourceMap.getString("lPropietario.text")); // NOI18N
        lPropietario.setName("lPropietario"); // NOI18N

        lTags.setText(resourceMap.getString("lTags.text")); // NOI18N
        lTags.setName("lTags"); // NOI18N

        lISBN.setText(resourceMap.getString("lISBN.text")); // NOI18N
        lISBN.setName("lISBN"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTags, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lPropietario)
                .addComponent(lCodigo)
                .addComponent(lISBN)
                .addComponent(lTags))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lISBN;
    private javax.swing.JLabel lPropietario;
    private javax.swing.JLabel lTags;
    // End of variables declaration//GEN-END:variables

    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if(value instanceof Libro){
            Libro l=(Libro)value;
            lCodigo.setText(l.getDatoString("id"));
            lPropietario.setText(l.getDatoString("propietario"));
            lTags.setText(l.getDatoString("tags"));
            lISBN.setText(l.getDatoString("isbn"));
        }    
        return this;
    }
    
}