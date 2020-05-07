package com.huliai;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComputingTheH {

    public static void main(String[] args) {
List<Integer> b = new ArrayList<>();
         b.add(1);
        b.add(4);
        b.add(1);
        b.add(4);
        b.add(2);
        b.add(1);
        b.add(3);
        b.add(4);
        b.add(6);
        String str = "a simple string";

        str = str.replace("a", "A SIMPLE").substring(2, 8);
        System.out.println(str);
    System.out.println(hIndex(b));

    }

    public static int hIndex(List<Integer> citations){

        Collections.sort(citations);
        final int n = citations.size();
        for(int i=0;i<n;++i){
            if(citations.get(i)>=n-i){
                return n-i;
            }
        }

        return 0;

    }



}
