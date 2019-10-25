package com.bhg.platform.demo.stream;

import java.util.stream.Stream;

/**
 * Created by zmk on 2019/10/25.
 */
public class ReduceStream {
    public static void main(String[] args){
        int sum = Stream.of(1, 2, 3)
                .reduce(1, (acc, element) -> acc + element);
        System.out.println(sum);
    }
}
