package DAO;

import DTO.LivroDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dougd
 */
public class LivroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();

    public void cadastraLivro(LivroDTO objlivrodto) {
        String sql = "insert into livro (titulo_livro, autor_livro, editora_livro, edicao_livro, ano_publica_livro) values (?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlivrodto.getTituloLivro());
            pstm.setString(2, objlivrodto.getAutorLivro());
            pstm.setString(3, objlivrodto.getEditoraLivro());
            pstm.setString(4, objlivrodto.getEdicaoLivro());
            pstm.setString(5, objlivrodto.getAnoPubLivro());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "LivroDAO Cadastra" + erro);
        }
    }


    public ArrayList<LivroDTO> PesquisarLivro(){

        String sql = "select * from livro";
        conn = new ConexaoDAO().conectaBD();

        

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
            LivroDTO objLivroDTO = new LivroDTO();
            objLivroDTO.setId_livro(rs.getInt("id_livro"));
            objLivroDTO.setTituloLivro(rs.getString("titulo_livro"));
            objLivroDTO.setAutorLivro(rs.getString("autor_livro"));           
            objLivroDTO.setEditoraLivro(rs.getString("editora_livro"));
            objLivroDTO.setEdicaoLivro(rs.getString("edicao_livro"));
            objLivroDTO.setAnoPubLivro(rs.getString("ano_publica_livro"));

            lista.add(objLivroDTO);
        }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO Pesquisar: " + erro);
        }
        return lista;
    }

    public void alterarLivro(LivroDTO objlivrodto){
        String sql = "update livro set titulo_livro = ?, autor_livro = ?, editora_livro = ?, edicao_livro = ?, ano_publica_livro = ? where id_livro = ?";
        conn = new ConexaoDAO().conectaBD();

        

        try {
             pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlivrodto.getTituloLivro());
            pstm.setString(2, objlivrodto.getAutorLivro());
            pstm.setString(3, objlivrodto.getEditoraLivro());
            pstm.setString(4, objlivrodto.getEdicaoLivro());
            pstm.setString(5, objlivrodto.getAnoPubLivro());
            pstm.setInt(6, objlivrodto.getId_livro());

            pstm.execute();
            pstm.close();

        

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO Alterar: " + erro);
        } 
    
    }
    
    public void excluiLivro(LivroDTO objlivrodto){
        String sql = "delete from livro where id_livro = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objlivrodto.getId_livro());

            pstm.execute();
            pstm.close();

        

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO Excluir: " + erro);
        } 
    }
}
