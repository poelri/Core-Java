package com.example.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class PatientDAOImpl implements PatientDAO{

    private Connection conn;

    // 생성자: DBConnection을 통해 데이터베이스 연결을 설정합니다.
    public PatientDAOImpl() {
        DBConnection dbConn = new DBConnection();
        this.conn = dbConn.getConnection();
    }
    // 새로운 환자를 데이터베이스에 생성하는 메서드
    @Override
    public boolean createPatient(PatientVO p) throws SQLException {
        // Statement 객체를 생성합니다.
        Statement stmt = this.conn.createStatement(); // 4
        StringBuffer sb = new StringBuffer();

        // SQL 쿼리를 생성합니다.
        sb.append("insert into patient ");
        sb.append("values(" + p.getNumber() +", '" + p.getCode() + "', ");
        sb.append(p.getDays() + ", " + p.getAge() + ", '" + p.getDept() + "', ");
        sb.append(p.getOperFee() + ", " + p.getHospitalFee() + ", " + p.getMoney() + ")");

        // 생성된 SQL 쿼리를 출력합니다.
        System.out.println(sb.toString());

        // SQL 쿼리를 실행하고 영향을 받은 행의 수를 반환받습니다.
        int su = stmt.executeUpdate(sb.toString()); // 5

        // 데이터베이스 연결과 Statement 객체를 닫습니다.
        DBClose.dbClose(this.conn, stmt);

        // 영향을 받은 행이 1개인 경우 true를 반환하고, 그렇지 않으면 false를 반환합니다.
        return (su ==1 ) ?true :false;
    }

    // 단일 환자 정보를 읽는 메서드
    @Override
    public PatientVO readPatient() {
        return null;
    }

    // 모든 환자 정보를 읽는 메서드
    @Override
    public List<PatientVO> readAllPatient() {
        return List.of();
    }

    // 환자 정보를 업데이트하는 메서드
    @Override
    public boolean updatePatient() {
        return false;
    }

    // 환자 정보를 삭제하는 메서드
    @Override
    public boolean deletePatient() {
        return false;
    }
}
