package application;

import java.sql.Connection;
import java.sql.SQLException;

import dboracle.Db;
import dboracle.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		conn = Db.getConnection();
		
		if(conn != null) {
			
			System.out.println("Conexão com o banco correta");
		}
		else {
			System.out.println("Conexão falhou");
		}
		
		Db.closeConnection();
		
			
		
		
	}
	

}
