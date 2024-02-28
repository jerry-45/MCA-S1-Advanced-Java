/* Using Java Generics converts run time exception into compile time exception. */

import java.util.*;

public class GenericExample1 {
    public static void main(String args[]){
        // Creating an ArrayList with String specified
        ArrayList <String> a1 = new ArrayList<String>();

        a1.add("Sachin");
        a1.add("Rahul");

        // Now compiler doesn't allow this
        a1.add(10);

        String s1 = (String)a1.get(0);
        String s1 = (String)a1.get(1);
        String s1 = (String)a1.get(2);
    }
}
