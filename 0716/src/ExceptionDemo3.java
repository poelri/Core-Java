public class ExceptionDemo3 {
    public static void main(String[] args) /*throws HistoryException*/ {
        Student popo = new Student();
        popo.setKor(90);
        try {
            popo.setHistory(120);
        } catch (HistoryException e) {
            throw new RuntimeException(e);
        }
        System.out.println(popo); // popo.toString
    }
}

class HistoryException extends Exception { // Checked Exception
    public HistoryException(String msg) { // 생성자
        super(msg);
    }
}

class KoreanException extends RuntimeException { // unchecked Exception
    public KoreanException(String msg) { // 생성자
        super(msg);
    }
}


class Student {
    private int kor;
    private int history;

    public void setHistory(int history) throws HistoryException {
        if (history >= 0 && history <= 100) this.history= history;
        else throw new HistoryException("역사점수는 0부터 100점까지의 범위만 인정합니다.");
    }

    public void setKor(int kor) throws KoreanException {
        if (kor >= 0 && kor <= 100) this.kor = kor;
        else throw new KoreanException("국어점수는 0부터 100점까지의 범위만 인정합니다.");
    }

    public String toString() {
        return "kor = " + this.kor + ", history = " + this.history;
    }

}
