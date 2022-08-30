package com.company;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        int i,n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            mylist.add(in.nextInt());
        }
        Stream<Integer> stream = mylist.stream();
        stream.forEach(System.out::println);
    }
}
