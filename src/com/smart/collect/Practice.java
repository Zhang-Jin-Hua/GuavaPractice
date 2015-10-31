package com.smart.collect;

import com.google.common.base.Function;
import com.google.common.collect.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Guava使用练习
 */
public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = Lists.newArrayList(new Integer[]{1, 2, 3, 4});

        List<String> transform = Lists.transform(list, new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + "";
            }
        });

        List<Integer> reverseList = Lists.reverse(list);
        for (Object o : transform) {
            System.out.println(o.getClass().toString() + o);
        }
        for (Object o : reverseList) {
            System.out.println(o);
        }
        System.out.println("Hell o");
        //不可变集合
        ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3, 4);
        ImmutableBiMap<Integer, String> immutableBiMap = ImmutableBiMap.of(1, "1", 2, "2");
        ImmutableSet<Integer> immutableSet = ImmutableSet.of(1, 2, 3, 4);
        ImmutableCollection<Integer> immutableCollection = ImmutableList.of(1, 2, 3, 4);

        for (Integer i : immutableList) {
            System.out.print(i + "-");
        }
        System.out.println();
        for (Integer i : immutableBiMap.keySet()) {
            System.out.print(immutableBiMap.get(i) + "-");
        }
        System.out.println();
        for (Integer i : immutableList) {
            System.out.print(i + "-");
        }
        System.out.println();
        for (Integer i : immutableCollection) {
            System.out.print(i + "-");
        }
        //新集合类型
        ArrayList arrayList = new ArrayList();
        arrayList.toArray();
        //集合工具
        //扩展工具类
    }
}
