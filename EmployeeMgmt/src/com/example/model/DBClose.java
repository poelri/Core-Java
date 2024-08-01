/*
    작성자 : 박은화
    작성일 : 2024-08-01
    작성목적 : 사원관리프로그램 -
    작성환경 : Windows 10 22H2(OS Build 19045.4651),
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
package com.example.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//7번
public class DBClose {
    public static void dbClose(Connection conn) {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void dbClose(Connection conn, Statement stmt) {
        try {
            if (conn != null) conn.close();
            if (stmt != null) stmt.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void dbClose(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}