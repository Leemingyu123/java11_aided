package nettest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test5//Application {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1234");
			//	Connection conn = DriverManager.getConnection();에 url을 나타내는
			// jdbc:mysql://localhost:3306 문장에서 데이터베이스 이름이 지정되지 않았음으로 연결되지못함
			//jdbc:mysql://localhost:3306/kh 로 변경하여 데이터 베이스를 연결하도록한다.
					
			PreparedStatement st = conn.prepareStatement(query);
			//query의 sql 구문이 지정되지않았음으로/ 실행문이 없으므로 query실행이 되지 못한다.
			//위 빈줄에 query에 대한 sql문을 작성한다. String query = "select emp_id, emp_name from employee"
			
			ResultSet rs = st.executeUpdate();//executeQuery
			//executeUpdate() 메소드는 int를 반환함으로 해당 검색결과인 ResultSet을 반환 받을수 없다.
			//executeQuery() 메소드로 변경한다
			while(rs) {
				System.out.println(rs.getString("empId")+"/"+rs.getString("empName"));
			}//rs는 다음 레코드를 지칭해야 레코드가 끝날때까지 반복 수행할수 없으므로 진행되지못한다.
			//while(rs)가 반복수행될수있도록 rs.next()로 변경한다.
			
			//System.out.println(rs.getString("empId")+"/"+rs.getString("empName"));에서 empid와empname컬럼이 존재하지 않으므로 해당 컬럼에 접근할수 없다. empId,empName
			//컬럼이름인 empId를 emp_id로 empName을 emp_name으로 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
