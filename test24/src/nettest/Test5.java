package nettest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1234");
			
			PreparedStatement st = conn.prepareStatement(query);
			
			ResultSet rs = st.executeUpdate();
			
			while(rs) {
				System.out.println(rs.getString("empID")+"/"+rs.getString("empName"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
