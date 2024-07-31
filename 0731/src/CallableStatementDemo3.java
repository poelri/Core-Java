import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DBConnection dbConn = new DBConnection();
        Connection conn =dbConn.getConnection(); //1. 2. 3.
        String sql = "{call sp_insertDept(?,?,?)}"; // 불완전한 SQL 문장
        CallableStatement cstmt = null;
        try {
            cstmt = conn.prepareCall(sql); // 4
            System.out.print("부서 번호 :"); int deptno = scan.nextInt();
            System.out.print("부서 이름 :"); String dname = scan.next();
            System.out.print("부서 위치 :"); String loc = scan.next();
            cstmt.setInt(1, deptno);
            cstmt.setString(2, dname);
            cstmt.setString(3, loc); // 완전한 SQL 문장
            cstmt.execute(); // 5
            System.out.println("새 레코드 삽입 성공");
        } catch(SQLException e) {
            System.out.println("삽입 실패");
        }
        DBClose.dbClose(conn, null); //7.
    }
}
/*
DELIMITER ;

call sp_deleteDept();

DELIMITER $$
CREATE PROCEDURE sp_insertDept
(
    IN v_deptno tinyint,
    IN v_dname varchar(14),
    IN v_loc varchar(13)
)
BEGIN
    INSERT INTO dept_clone(deptno, dname, loc)
    VALUES(v_deptno, v_dname, v_loc);
    commit;
END
$$
DELIMITER ;
*/