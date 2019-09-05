package com.dayee.controller;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/**
 * Created by xuruanshun on 2019/9/4.
 */
public class Demo {

    public static void main(String[] args) {

        //test01();
        //test02();
        test3();
    }


    private static void test1() {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("C",3);
        map.put("B",2);
        map.put("E",5);
        map.put("D",4);

        // 通过map.entrySet()将map转换为"A=1"形式的list集合
        List<Map.Entry<String,Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());

        // 通过Collections.sort()排序
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list){
            // 得到排序后的键值
            System.out.println(entry.getKey());
        }
    }

    private static void test2() {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("C",3);
        map.put("B",2);
        map.put("E",5);
        map.put("D",4);

        // 通过map.entrySet()将map转换为"A=1"形式的list集合
        List<Map.Entry<String,Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());

        List<String> keys = list.stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue))
                .map(Map.Entry<String, Integer>::getKey)
                .collect(Collectors.toList());
        keys.forEach(System.out::println);


        /*
        * 在JDK 1.8中新增了函数式编程，对上述代码的解释为：
            1、先将list集合转换为流，即：list.stream()，值得注意的是：在stream()中所做的任何操作都不会影响到原集合；
            2、sorted() 方法：对list集合进行排序
            3、Comparator.comparing(Map.Entry<String, Integer>::getValue)：顾名思义，就是此处的比较规则，Map.Entry中有getKey(),getValue()等方法，通过改变取值，就可以改变排序对象，而默认排序为自然排序，reversed()：该方法将 其改变为倒序；
            4、map(Map.Entry<String, Integer>::getKey)：此处将Entry<String, Integer>中的key单独抽离出来；
            5、collect(Collectors.toList())：告诉程序返回的是一个List集合；
        * */

    }


    private static void test3() {
        Map<String,Integer> map =new HashMap<>();
        Map<Integer, List<String>> groupMap = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",2);
        map.put("M",3);
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                if(groupMap.containsKey(value)){
                    groupMap.get(value).add(key);
                }else{
                    List<String> values = new ArrayList<>();
                    values.add(key);
                    groupMap.put(value, values);
                }
            }
        });
        System.out.println(groupMap);


        /*Map<Integer, List<Map.Entry<String,Integer>>>
                result= map.entrySet().stream().
                        collect(Collectors.groupingBy(c -> c.getValue()));

        System.out.println(result);*/
    }



}
