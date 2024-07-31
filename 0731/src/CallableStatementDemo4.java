import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DBConnection dbConn = new DBConnection();
        Connection conn =dbConn.getConnection(); //1. 2. 3.
        String sql = "{call sp_selectEmp(?,?,?)}"; // 불완전한 SQL 문장
        CallableStatement cstmt = null;
        try {
            cstmt = conn.prepareCall(sql); // 4
            System.out.print("사원 번호 :"); int empno = scan.nextInt();
            cstmt.setInt(1, empno);
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.registerOutParameter(3, Types.VARCHAR);// 완전한 SQL 문장
            cstmt.execute(); // 5
            System.out.printf("부서명 : %s, 부서위치 : %s%n",
                    cstmt.getString(2), cstmt.getString(3));
        } catch(SQLException e) {
            System.out.println("실패");
        }
        DBClose.dbClose(conn, null); //7.
    }
}
 /* 사원 번호를 입력받아서 부서이름과 부서위치를 출력하시오 */
/*
DELIMITER $$
CREATE PROCEDURE sp_selectEmp
        (
                IN v_empno SMALLINT,
                OUT v_dname VARCHAR(14),
OUT v_loc VARCHAR(13)
    )
BEGIN
        SELECT dname, loc INTO v_dname,v_loc
FROM emp JOIN dept On(emp.deptno = dept.deptno)
WHERE empno = v_empno;
END
        $$
DELIMITER ;
*/
