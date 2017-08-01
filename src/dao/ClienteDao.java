package dao;

import database.Conexao;
import dto.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private List<Cliente> clientes = new ArrayList<>();
    private Cliente cliente;

    public List<Cliente> consultar() {

        conn = Conexao.getConn();

        try {

            stmt = conn.prepareStatement("SELECT * FROM cliente");

            rs = stmt.executeQuery();

            while (rs.next()) {

                cliente = new Cliente();
                cliente.setTitular(rs.getString("titular"));
                cliente.setDependente(rs.getString("dependente"));
                clientes.add(cliente);
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {

            System.out.println("Servidor deu erro!");
        }

        return clientes;
    }
}
