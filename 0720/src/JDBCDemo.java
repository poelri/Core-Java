// 7단계
// 1. import 하자. java.sql.*

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        // 2. MySQL Driver Loading 하자.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Founded");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not Found");
        }

        // 3. Memory에 loading된 MySQL Driver를 이용하여 Connection 하자
        String url = "jdbc:mysql://localhost:3306/mycompany";
        Connection conn = null;
        try {
           conn =  DriverManager.getConnection(url, "root", "1234");
            System.out.println("Connection Success");
        } catch (SQLException e) {
            System.out.println("Connection Failure");
        }
        // 4. Statement 객체 생성
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // 5.Statement 객체를 이용하여 Sql 실행하자.
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT now(), version()");
        } catch (SQLException e) {
            System.out.println("Query Syntax Error");
        } //SELECT 용
        // 6. ResultSet의 결과를 Parsing 하자.
        try {
            rs.next();
            String now = rs.getString(1); // DB는 인덱스가 1부터 시작
            String version = rs.getString(2);
            System.out.println(now + ", " + version);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // 7.반드시 Close해야 한다.
            try {
                if(rs != null)rs.close();
                if(stmt != null)rs.close();
                if(conn != null);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

