package com.example.controller;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class InsertController { // 환자 정보를 데이터베이스에 삽입하는 역할
    private PatientDAO pDao;

    public InsertController() { // Constructor 생성자
        pDao = new PatientDAOImpl();
    }

    // 환자 정보를 삽입하는 메서드
    public boolean insert(PatientVO p){// 환자가 넘어온다
        boolean result = false;
        try{
            CalcController calcController = new CalcController(p);
            result = pDao.createPatient(p);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
