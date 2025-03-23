/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toysystem1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ClienteDAO {
   
    
    
    public void cadastrarCliente(String nome, String endereco, String cpf, String telefone, String email) {
        Connection conexao = ConexaoBD.conectar();
        if (conexao == null) return;
        
        String sql = "INSERT INTO clientes (nome, endereco, cpf, telefone, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, cpf);
            stmt.setString(4, telefone);
            stmt.setString(5, email);
            stmt.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
        
    }

   
}
 

