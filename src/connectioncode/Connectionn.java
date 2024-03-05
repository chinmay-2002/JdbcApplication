package connectioncode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionn {

	public static void main(String[] args) {
		String url = "";
		String usrrname = "";
		String passwd = "";
		Connection con;
		System.out.println("Hello Chinmay How are you?");
		try {
			con = DriverManager.getConnection(url, usrrname, passwd);
			System.out.println("Connected");
			con.close();
		}
		catch(SQLException e) {
			System.out.println("Exception occurs");
		}
		

	}

}
