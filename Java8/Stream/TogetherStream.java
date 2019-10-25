package com.bhg.platform.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zmk on 2019/10/25.
 */
public class TogetherStream {
    public static void main(String[] args){
        People yunhchang = new People("yunhchang", 29);
        People yide = new People("yide", 26);
        List<People>  list1 = new ArrayList<>();
        list1.add(yunhchang);
        list1.add(yide);

        People zilong = new People("zilong", 27);
        People mengqi = new People("mengqi", 25);
        People hansheng = new People("hansheng", 28);
        List<People>  list2 = new ArrayList<>();
        list2.add(zilong);
        list2.add(mengqi);
        list2.add(hansheng);

        List<People> together = Stream.of(list1, list2)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(together);
    }

}
