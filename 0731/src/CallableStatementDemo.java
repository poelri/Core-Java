import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection(); // 객체를 생성
        Connection conn = dbConn.getConnection(); //1,2,3 DBConnection 객체를 통해 데이터베이스에 연결을 수립하고, Connection 객체를 반환받습니다.
        String sql = "{call sp_test(?,?)}"; // 미완성 SQL 문장 호출할 저장 프로시저 sp_test의 SQL 구문을 문자열로 정의
        CallableStatement cstmt = conn.prepareCall(sql); // 4 .Connection 객체를 사용하여, 정의된 SQL 구문에 대한 CallableStatement 객체를 생성합니다
        // IN parameter는 setXxx()를 사용하고,
        // OUT, INOUT parameter는 resisterOutParameter()를 사용한다.
        // INOUT paramert는 setXxx(), resiterOutParameter()를 사용한다.
        cstmt.registerOutParameter(1, Types.DATE); // 날짜
        cstmt.registerOutParameter(2, java.sql.Types.VARCHAR); // 문자 << 완전한 SQL 문장
        cstmt.execute();
        // ResultSet rs = cstmt.executeQuery(); // 5 CallableStatement 객체를 실행하여, 저장 프로시저의 결과를 ResultSet 객체로 반환받습니다.
        // rs.next(); // ResultSet의 첫 번째 결과로 커서를 이동
        System.out.println(cstmt.getDate(1)); // 첫 번째 OUT 매개변수로 반환된 날짜 값을 출력합니다
        System.out.println(cstmt.getString(2)); // 두 번째 OUT 매개변수로 반환된 문자열 값을 출력합니다.
        DBClose.dbClose(conn, null); //7 데이터베이스 연결을 닫습니다.
    }
}
