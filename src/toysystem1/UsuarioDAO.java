/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toysystem1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UsuarioDAO {
    public void cadastrarUsuario(String login, String senha) {
        Connection conexao = ConexaoBD.conectar();
        if (conexao == null) return;
        
          String sql = "INSERT INTO usuarios (login, senha) VALUES (?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
}
}