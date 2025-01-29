package com.fss;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
 
public class CollectionFramework {
 
    public static void main(String[] args) {
 
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(18);
        numbers.add(50);
        numbers.add(31);
        numbers.add(99);
       
        System.out.println("ArrayList: " + numbers);
       
        Collections.sort(numbers);
       
        System.out.println("Sorted ArrayList: " + numbers);
       
        HashSet<String> names = new HashSet<>();
        names.add("Abc");
        names.add("Abcd");
        names.add("Efg");
        names.add("Abc");  
       
        System.out.println("Unique Names: " + names);
       
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("abc", 100);
        studentScores.put("abcd", 99);
        studentScores.put("efg", 98);
        studentScores.put("efgh", 98);
       
        System.out.println("Student Scores: " + studentScores);
    }
 
}