/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toysystem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/toy_system";
    private static final String USUARIO = "root"; // Substitua pelo seu usuário do MySQL
    private static final String SENHA = "88082288"; // Substitua pela sua senha do MySQL
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
}
}
