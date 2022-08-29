import java.sql.*;
public class CommentTest {
    public CommentTest() {}
    public static void main(String args[]) {	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");	
	}catch(ClassNotFoundException e ) {
		e.printStackTrace();
	}
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String pass = "tiger";
	try {		
		Connection con = DriverManager.getConnection(url,user,pass);
		/*
		Statement stmt = con.createStatement();		
		String query = "SELECT * FROM tb_comment";			
		*/
		
		String query = "SELECT * FROM tb_comment";
		PreparedStatement pstmt = con.prepareStatement(query); 
		
		ResultSet rs = pstmt.executeQuery();	
		
		//ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()){
                    String id=rs.getString("id").trim();
                    String content=rs.getString("content").trim();
                    String name=rs.getString("name").trim();
                    System.out.println("id= " + id);
                    System.out.println("content= " + content);
                    System.out.println("name= " + name);
		}
        rs.close();		
        //stmt.close();		
        pstmt.close();
        con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}    
   }   
}