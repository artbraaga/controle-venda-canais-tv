package dao;

import database.Conexao;
import dto.Canal;
import dto.Programa;
import java.sql.*;
import java.util.*;

public class CanalDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private List<Canal> canais = new ArrayList<>();
    private Canal canal;
    
    public List<Canal> consultar() {
        
        conn = Conexao.getConn();
        
        try {
            
            stmt = conn.prepareStatement("SELECT * FROM canal");
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                canal = new Canal();
                canal.setNome(rs.getString("nome"));
                canal.setDescricao(rs.getString("descricao"));
                canais.add(canal);
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            
            System.out.println("Servidor deu erro!");
        }
        
        return canais;
    }
    
    public void adicionar(Canal canal) {
        
        conn = Conexao.getConn();
        
        try {
            
            stmt = conn.prepareStatement("INSERT INTO canal VALUES (0, ?, ?)");
            
            stmt.setString(1, canal.getNome());
            stmt.setString(2, canal.getDescricao());
            
            stmt.execute();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            
            System.out.println("Servidor deu erro!");
        }
    }
}
