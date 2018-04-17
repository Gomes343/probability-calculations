package Aula09;

import Aula01_a_Aula08.Frequencia_e_Classe;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExercicioGraficoView extends javax.swing.JFrame {

         
    Frequencia_e_Classe fc = new Frequencia_e_Classe();
    String arquivo = null;

    public ExercicioGraficoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        altura = new javax.swing.JButton();
        bairro = new javax.swing.JButton();
        estadocivil = new javax.swing.JButton();
        idade = new javax.swing.JButton();
        peso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATIVIDADE DE GRAFICOS ");

        altura.setText("Altura");
        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });

        bairro.setText("Bairro");
        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });

        estadocivil.setText("EstadoCivil");
        estadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadocivilActionPerformed(evt);
            }
        });

        idade.setText("Idade");
        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });

        peso.setText("Peso");
        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cada botão representa um dos arquivos TXT solicitados na atividade!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estadocivil)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairro)
                    .addComponent(altura))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peso)
                    .addComponent(idade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(estadocivil)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        arquivo = "idade";
        try {
            fc.LerArquivoInt(arquivo);
        } catch (IOException ex) {
            Logger.getLogger(ExercicioGraficoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fc.GerarValoresQuantitativos();
        fc.GraficoQuantitativo();
        
    }//GEN-LAST:event_idadeActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        arquivo = "peso";
        try {
            fc.LerArquivoInt(arquivo);
        } catch (IOException ex) {
            Logger.getLogger(ExercicioGraficoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fc.GerarValoresQuantitativos();
        fc.GraficoQuantitativo();

        
    }//GEN-LAST:event_pesoActionPerformed

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        arquivo = "altura";
        try {
            fc.LerArquivoDouble(arquivo);
        } catch (IOException ex) {
            Logger.getLogger(ExercicioGraficoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fc.GerarValoresQuantitativos();
        fc.GraficoQuantitativo();
        
        
    }//GEN-LAST:event_alturaActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
        arquivo = "bairro";
        try {
            fc.LerArquivoString(arquivo);
        } catch (IOException ex) {
            Logger.getLogger(ExercicioGraficoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fc.Definir_ClassesString();
        fc.GraficoQualitativo();
        
    }//GEN-LAST:event_bairroActionPerformed

    private void estadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadocivilActionPerformed
        arquivo = "estadoCivil";
        try {
            fc.LerArquivoString(arquivo);
        } catch (IOException ex) {
            Logger.getLogger(ExercicioGraficoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fc.Definir_ClassesString();
        fc.GraficoQualitativo();
        
    }//GEN-LAST:event_estadocivilActionPerformed

    public static void main(String args[]) {

        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExercicioGraficoView().setVisible(true);
            }
            
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altura;
    private javax.swing.JButton bairro;
    private javax.swing.JButton estadocivil;
    private javax.swing.JButton idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton peso;
    // End of variables declaration//GEN-END:variables
}
