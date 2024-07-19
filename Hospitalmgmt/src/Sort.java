/*
    작성자: 오승찬
    작성목적: 번호 quicksort
    작성환경: mac, IntelliJ
    작성일: 2024.07.19
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public List<Hospital> list;
    public Sort(List<Hospital> list) {
        this.list = list;
    }

    public void quickSort() {
        Collections.sort(this.list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital o1, Hospital o2) {
                return o1.getNum() - o2.getNum();
            }
        });
    }
}