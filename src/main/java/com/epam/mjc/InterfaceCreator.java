package com.epam.mjc;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {

        return x -> {

            int size = x.size();

            int count = 0;


            for(String str : x) {

                char a = str.charAt(0);

                if(Character.isUpperCase(a)) {

                    count++;

                }

            }

            boolean y = size == count;

            return y;
        };

    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {

        List<Integer> y = new LinkedList<>();

        return x -> {

            for(Integer x1 : x) {

                if(x1 % 2 == 0) {

                    y.add(x1);

                }

            }

            x.addAll(y);

        };

    }

    public Supplier<List<String>> filterCollection(List<String> values) {

        List<String> y = new LinkedList<>();

        return () -> {

            for(String str : values) {

                char a = str.charAt(0);

                char b = str.charAt(str.length()-1);

                String[] c = str.split(" ");

                if( Character.isUpperCase(a) && b == '.' && c.length > 3) {

                    y.add(str);

                }

            }

            values.clear();

            values.addAll(y);

            return values;

        };

    }

    public Function<List<String>, Map<String, Integer>> stringSize() {

        return x -> {

            Map<String, Integer> map = new HashMap<>();

            for(String str : x) {

                map.put(str, str.length());

            }

            return map;

        };

    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {

        return (list1, list2) -> {

            ArrayList<Integer> c = new ArrayList<>();

            c.addAll(list1);

            c.addAll(list2);

            return c;

        };

    }
}
