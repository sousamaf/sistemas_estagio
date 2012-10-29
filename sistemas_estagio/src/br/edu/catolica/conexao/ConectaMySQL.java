package br.edu.catolica.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {
	
	public static void main(String[] args){
		Connection conexao = null;
		try{
			// Registrando a classe JDBC no sistema em tempo de execu��o
			String url = "jdbc:mysql://localhost/estagio";
			String usuario = "root";
			String senha= "root";
			
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectou!");
		}catch (SQLException e){
			System.out.println("Ocorreu um erro de SQL. Erro: " +e.getMessage());
		}finally {
			try {
				conexao.close();
			}catch (SQLException e){
				System.out.println("Erro ao fechar a conex�o. Erro: " + e.getMessage());
			}
		}
	}

}