/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




public class ProdutosDAO { 
 public List<ProdutosDTO> listarProdutos() {

    List<ProdutosDTO> lista = new ArrayList<>();

    try {
        Connection conexao = new conectaDAO().getConnection();

        String sql = "SELECT * FROM produtos";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            ProdutosDTO produto = new ProdutosDTO();

            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getInt("valor"));
            produto.setStatus(rs.getString("status"));

            lista.add(produto);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return lista;
}
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        
        
        //conn = new conectaDAO().connectDB();
        
        
    }
    
   public List<ProdutosDTO> listarProdutosVendidos() {

    List<ProdutosDTO> lista = new ArrayList<>();

    try {
        Connection conexao = new conectaDAO().getConnection();

        String sql = "SELECT * FROM produtos WHERE status = 'Vendido'";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            ProdutosDTO produto = new ProdutosDTO();

            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getInt("valor"));
            produto.setStatus(rs.getString("status"));

            lista.add(produto);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return lista;
}
    public void venderProduto(int id) {
    try {
        Connection conexao = new conectaDAO().getConnection();

        String sql = "UPDATE produtos SET status = 'Vendido' WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);

        stmt.execute();

    } catch (Exception e) {
        System.out.println("Erro ao vender produto");
    }
}
    
        
}

