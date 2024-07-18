package com.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort { // 객체의 리스트를 정렬하는 기능
    private List<Product> list;

    public Sort(List<Product> list) {
        this.list = list;
    }
    public void quickSort() {
        Collections.sort(this.list, new Comparator<Product>() {

            @Override
            public int compare(Product front, Product back) {
                return back.getBanefit() -front.getBanefit();
            }
        });
    }
}
