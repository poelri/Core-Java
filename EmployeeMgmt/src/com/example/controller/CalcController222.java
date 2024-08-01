// /*
//     작성자 : 박은화
//     작성일 : 2024-08-01
//     작성목적 : 사원관리프로그램 -
//     작성환경 : Windows 10 22H2(OS Build 19045.4651),
//             JDK 17.0.10
//             IntelliJ IDEA 2024.1.4 (Ultimate Edition)
//  */
// package com.example.controller;
// import com.example.model.EmployeeVO;
//
// public class CalcController {
//     private EmployeeVO e;
//     public CalcController(EmployeeVO e) {
//         this.e = e;
//         this.calc();
//     }
//
//     public void calc() {
//         // 부서명 코드
//         String dname =  (e.getEmpno().startsWith("A")) ? "영업부" :
//                         (e.getEmpno().startsWith("B")) ? "업무부" :
//                         (e.getEmpno().startsWith("C")) ? "홍보부" :
//                         (e.getEmpno().startsWith("D")) ? "인사부" :
//                         (e.getEmpno().startsWith("E")) ? "경리부" :
//                         (e.getEmpno().startsWith("F")) ? "판촉부" :
//                         (e.getEmpno().startsWith("G")) ? "총무부" : "미확인 부서";
//
//         // 기본급 (기본급 참조)
//         int sal = (e.getSal() == 1) ? 15000 : (e.getSal() == 2) ? 25000 :
//                   (e.getSal() == 3) ? 35000 : (e.getSal() == 4) ? 45000 :0;
//
//         // 호급수당 ( 호급수당 참조)
//             // 두 번째 숫자 추출
//             String empno = e.getEmpno();
//             int secondDigit = (empno.length() > 1 && Character.isDigit(empno.charAt(1)))
//                     ? Character.getNumericValue(empno.charAt(1))
//                     : 0; // 기본값 0 설정
//
//             // 호급수당 결정 (삼항 연산자 사용)
//             int rsal =  (secondDigit == 1) ? 900000 :
//                         (secondDigit == 2) ? 400000 :
//                         (secondDigit == 3) ? 600000 :
//                         (secondDigit == 4) ? 800000 :
//                         (secondDigit == 5) ? 300000 :
//                         (secondDigit == 6) ? 800000 :
//                         (secondDigit == 7) ? 800000 : 0; // 기본값 0 설정
//
//         // 야간수당 ( 야간수당표 참조 )
//         int nsal = (e.getNhour() == 1) ? 1500 : (e.getNhour() == 2) ? 2500 :
//                    (e.getNhour() == 3) ? 3500 : (e.getNhour() == 4) ? 4500 : 0;
//
//         // 가족수당 ( 7000 * 가족수 )
//         int fsal = 7000 * e.getFcount();
//
//         // 총금액 ( 호급수당 + 기본급 + 야간수당 + 가족수당 )
//         int total = rsal + sal + nsal + fsal;
//
//         // 세금 ( 호급수당의 10% )
//         double tax = rsal * 0.10;
//
//         // 실수령액
//         int realTotal = (int) (total - tax);
//
//         this.e.setDname(dname);
//         this.e.setRsal(rsal);
//         this.e.setFsal(fsal);
//         this.e.setNsal(nsal);
//         this.e.setTotal(total);
//         this.e.setRealTotal(realTotal);
//
//     }
//
// }
