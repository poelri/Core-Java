import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); //1,2,3
        String sql = "{call sp_test}";
       CallableStatement stmt = conn.prepareCall(sql);
        DBClose.dbClose(conn, null); //7
    }
}
