package musa.com;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Динамический массив, удобно искать по индексу, удобно добавлять с конца
        List<Integer> arrayList = new ArrayList<>();
//        Динамический массив ссылок, удобно добавлять в начало
        List<Integer> linkedList = new LinkedList<>();


//        Внутри не будет порядка
        Map<Integer, String> hashMap = new HashMap<>();
//        Сортируется в том же порядке, в котором были добавлены элементы
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
//        Сортируется по ключам в естественном порядке
        Map<Integer, String> treeMap = new TreeMap<>();
        /**
        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
         */
    }

    public static void testMap (Map<Integer, String> map) {
        map.put(11, "One");
        map.put(2, "Two");
        map.put(33, "Tree");
        map.put(4, "Four");
        map.put(53, "Five");
        map.put(221, "Six");

        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }

    }
}
