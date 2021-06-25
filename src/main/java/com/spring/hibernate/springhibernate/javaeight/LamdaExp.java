package com.spring.hibernate.springhibernate.javaeight;

import java.util.*;

public class LamdaExp {
    static List listIntoLambda(){
        List<String> list = new ArrayList<>(2);
        list.add("RFT");
        list.add("LSEG");
        list.add("TR");

        list.forEach(System.out::println);

        //list.stream().forEach(lst -> System.out.println(lst));

        /*list.stream()
                .filter(s->s.contains("RFT"))
                .forEach(System.out::println);*/

        /*Optional.ofNullable(list)
                .orElseGet(Collections::emptyList).stream().filter(Objects::nonNull).peek(lst -> System.out.println(lst));*/

        return null;
    }

    public static void main(String[] args) {
        listIntoLambda();
    }
}
