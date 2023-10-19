package com.one;
import java.util.HashSet;
public class HelloWorld {
public static void main(String[] args) {
	 HashSet<String> stringSet = new HashSet<>();
	 stringSet.add("Apple");
    
     stringSet.add("watermelon");
     stringSet.add("Gauva");
     System.out.println("HashSet elements: " + stringSet);
     stringSet.remove("Banana");
     System.out.println("HashSet elements after removing: " + stringSet);
     System.out.println("new line");


}
}
