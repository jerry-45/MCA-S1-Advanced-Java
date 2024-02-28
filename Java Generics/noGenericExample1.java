/* Java program to demonstrate that NOT using generics can cause run time exceptions */

import java.util.*;

class noGenericExample1{
    public static void main(String args[]){
        // Creating an ArrayList without any type specified
        ArrayList a1 = new ArrayList();

        a1.add("Sachin");
        a1.add("Rahul");
        a1.add(10);    // Compiler allows this

        String s1 = (String)a1.get(0);
        String s2 = (String)a1.get(1);

        // Causes Runtime Exception
        String s3 = (String)a1.get(2);
    } 
}