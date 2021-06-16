package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(30);

        for (int o = 0; o < 30; o++) {
            Random randomInt = new Random();
            list.add(o, randomInt.nextInt(30));
        }
        System.out.println(list);


        Set<Integer> set = new HashSet<>(list);//Set-таблица для хранения уникальных элементов(т.е. не повторяются)
        for (Integer a : set) {

        }
        System.out.println(set);


        // ThreadLocalRandom.current().nextInt(1,10);


    }
}
