package VIEW;

import DAO.CategoriaDAO;
import DTO.CategoriaDTO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmLoginView extends javax.swing.JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Login"); // Cria um JFrame
        // Define a operação de fechamento
        frame.setSize(400, 300); // Define o tamanho da janela

        FrmLoginView loginView = new FrmLoginView(); // Cria uma instância da tela de login

        frame.getContentPane().add(loginView); // Adiciona a tela de login ao JFrame
        frame.setVisible(true); // Torna o JFrame visível
    }

    private String erro;
    private String rscategoriaDAO;

    public FrmLoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnButon = new javax.swing.JButton();

        jLabel1.setText("Descrição");

        btnButon.setText("jButton1");
        btnButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnButon)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnButon)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnButonActionPerformed

        try {

            String descricao_Categoria;

            descricao_Categoria = txtDescricao.getText();

            CategoriaDTO objCategoriaDTO = new CategoriaDTO();
            objCategoriaDTO.setCategoria_descricao(descricao_Categoria);
            CategoriaDAO objCategoriaDAO = new CategoriaDAO();
            
            objCategoriaDAO.cadastrarCategoria(objCategoriaDTO);
      

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "FRMLOGINVIEW" + erro);
        } catch (SQLException ex) {
            Logger.getLogger(FrmLoginView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnButonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables

    private void Disposer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
