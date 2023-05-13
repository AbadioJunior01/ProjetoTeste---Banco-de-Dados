package DAO;

import DTO.CategoriaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CategoriaDAO {

    Connection conn;
    PreparedStatement pstm;

    @SuppressWarnings("empty-statement")
    
    public int cadastrarCategoria(CategoriaDTO objCategoriaDTO) throws SQLException {
     String Sql = "Insert Into Categoria(descricao) values(?)";            
        conn = new ConexaoDAO().conectaBD();

        try {
            
            pstm = conn.prepareStatement(Sql);
            pstm.setString(1, objCategoriaDTO.getCategoria_descricao());
            
           
            return pstm.executeUpdate();
            
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "CategoriaDAO" + erro);
            
        }
        return 0;
    }
}
    

