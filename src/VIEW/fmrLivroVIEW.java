/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.LivroDAO;
import DTO.LivroDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dougd
 */
public class fmrLivroVIEW extends javax.swing.JFrame {

    /**
     * Creates new form fmrLivroVIEW
     */
    public fmrLivroVIEW() {
        initComponents();
        listarValoresLivro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JTextField();
        txtAutorLivro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditoraLivro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdicaoLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAnoLivro = new javax.swing.JTextField();
        btnCadastra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaLivro = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCarregarCampos = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GERENCIA BIBLIOTECA");

        jLabel2.setText("Titulo do Livro");

        jLabel3.setText("Autor do Livro");

        txtAutorLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorLivroActionPerformed(evt);
            }
        });

        jLabel4.setText("Editora");

        jLabel5.setText("Edição");

        jLabel6.setText("Ano de Publicação");

        btnCadastra.setText("CADASTRAR");
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });

        tabelaLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Livro", "Titulo", "Autor", "Editora", "Edição", "Ano"
            }
        ));
        jScrollPane2.setViewportView(tabelaLivro);

        txtCodigo.setEnabled(false);

        jLabel7.setText("Código");

        btnCarregarCampos.setText("CARREGAR CAMPOS");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCarregarCampos)
                                .addGap(70, 70, 70)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastra))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtAnoLivro)
                                    .addComponent(txtEdicaoLivro))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel1))
                            .addComponent(jLabel7)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnLimpar)
                .addGap(79, 79, 79)
                .addComponent(btnExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdicaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastra)
                    .addComponent(btnCarregarCampos)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
       CadastrarLivros();
       listarValoresLivro();
       LimparCampos();
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void txtAutorLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorLivroActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarLivro();
        listarValoresLivro();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirLivro();
        listarValoresLivro();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmrLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrLivroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastra;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaLivro;
    private javax.swing.JTextField txtAnoLivro;
    private javax.swing.JTextField txtAutorLivro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdicaoLivro;
    private javax.swing.JTextField txtEditoraLivro;
    private javax.swing.JTextField txtNomeLivro;
    // End of variables declaration//GEN-END:variables

    private void listarValoresLivro() {
        try {

            LivroDAO objLivroDAO = new LivroDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaLivro.getModel();
            model.setNumRows(0);
            ArrayList<LivroDTO> lista = objLivroDAO.PesquisarLivro();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_livro(),
                    lista.get(num).getTituloLivro(),
                    lista.get(num).getAutorLivro(),
                    lista.get(num).getEditoraLivro(),
                    lista.get(num).getEdicaoLivro(),
                    lista.get(num).getAnoPubLivro()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW: " + erro);
        }
        
    }

    
    private void CarregarCampos(){
    int setar = tabelaLivro.getSelectedRow();
    
    txtCodigo.setText(tabelaLivro.getModel().getValueAt(setar, 0).toString());
    txtNomeLivro.setText(tabelaLivro.getModel().getValueAt(setar, 1).toString());
    txtAutorLivro.setText(tabelaLivro.getModel().getValueAt(setar, 2).toString());
    txtEditoraLivro.setText(tabelaLivro.getModel().getValueAt(setar, 3).toString());
    txtEdicaoLivro.setText(tabelaLivro.getModel().getValueAt(setar, 4).toString());
    txtAnoLivro.setText(tabelaLivro.getModel().getValueAt(setar, 5).toString());
    }
    
    
    private void CadastrarLivros(){
     String titulo, autor, editora, edicao, anoPublicaLivro;

        titulo = txtNomeLivro.getText();
        autor = txtAutorLivro.getText();
        editora = txtEditoraLivro.getText();
        edicao = txtEdicaoLivro.getText();
        anoPublicaLivro = txtAnoLivro.getText();

        LivroDTO objlivrodto = new LivroDTO();
        objlivrodto.setTituloLivro(titulo);
        objlivrodto.setAutorLivro(autor);
        objlivrodto.setEditoraLivro(editora);
        objlivrodto.setEdicaoLivro(edicao);
        objlivrodto.setAnoPubLivro(anoPublicaLivro);

        LivroDAO objlivrodao = new LivroDAO();
        objlivrodao.cadastraLivro(objlivrodto);
    }
    
    private void LimparCampos(){
        txtCodigo.setText("");
        txtNomeLivro.setText("");
        txtAutorLivro.setText("");
        txtEditoraLivro.setText("");
        txtEdicaoLivro.setText("");
        txtAnoLivro.setText("");
        txtNomeLivro.requestFocus();
    }

    private void AlterarLivro(){
        String tituloLivro, autorLivro, editoraLivro, edicaoLivro, anoPubLivro;
        int id_livro;
        
        id_livro = Integer.parseInt(txtCodigo.getText());
        tituloLivro = txtNomeLivro.getText();
        autorLivro = txtAutorLivro.getText();
        editoraLivro = txtEditoraLivro.getText();
        edicaoLivro = txtEdicaoLivro.getText();
        anoPubLivro = txtAnoLivro.getText();
        
        LivroDTO objLivroDTO = new LivroDTO();
        objLivroDTO.setId_livro(id_livro);
        objLivroDTO.setTituloLivro(tituloLivro);
        objLivroDTO.setAutorLivro(autorLivro);
        objLivroDTO.setEditoraLivro(editoraLivro);
        objLivroDTO.setEdicaoLivro(edicaoLivro);
        objLivroDTO.setAnoPubLivro(anoPubLivro);
        
        
        LivroDAO objLivroDAO = new LivroDAO();
        objLivroDAO.alterarLivro(objLivroDTO);
    }
    
    private void ExcluirLivro(){
        int id_livro;
        
        id_livro = Integer.parseInt(txtCodigo.getText());
        
        LivroDTO objlivrodto = new LivroDTO();
        objlivrodto.setId_livro(id_livro);
        
        LivroDAO objlivrodao = new LivroDAO();
        objlivrodao.excluiLivro(objlivrodto);
        
    }

}
