package com.one;
import java.util.HashSet;
public class HelloWorld {
public static void main(String[] args) {
	 HashSet<String> stringSet = new HashSet<>();
	 stringSet.add("Apple");
    
     stringSet.add("watermelon");
     
     System.out.println("HashSet elements: " + stringSet);
     stringSet.remove("Banana");
     
     System.out.println("new line");


}
}
