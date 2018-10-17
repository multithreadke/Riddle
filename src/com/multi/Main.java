package com.multi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Integer[] nums = {1, 0, 7, 2, 2, 7, 11, 5, 6, 6, 5, 7, 9, 10, 4, 3, 9, 3, 2, 8};
        Character[] chars = {'a', 'c', 'e', 'i', 'n', 'o', 'p', 'r', 's', 't', 'u', '.'};
        List<Character> charList = Arrays.asList(chars);
        Stream.of(nums).map(currentNum -> charList.get(currentNum)).forEach(System.out::print);
        System.out.println("@Vodafone.com");
    }
}
