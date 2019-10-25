package com.bhg.platform.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zmk on 2019/10/25.
 */
public class MaxMinStream {
    public static void main(String[] args){
        People yunhchang = new People("yunhchang", 29);
        People yide = new People("yide", 26);
        People zilong = new People("zilong", 27);
        People mengqi = new People("mengqi", 25);
        People hansheng = new People("hansheng", 28);
        List<People> list1 = new ArrayList<>();
        list1.add(yunhchang);
        list1.add(yide);
        list1.add(zilong);
        list1.add(mengqi);
        list1.add(hansheng);

        People people1 = list1.stream()
                .min(Comparator.comparing(people -> people.getAge()))
                .get();
        System.out.println(people1);
        People people2 = list1.stream()
                .max(Comparator.comparing(people -> people.getAge()))
                .get();

        System.out.println(people2);

    }
}
