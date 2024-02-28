/* We don't need to typecast individual members of ArrayList */

import java.util.*;

public class GenericExample2 {
    public static void main(String args[])
    {
        // Creating an ArrayList with String specified
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("Sachin");
        a1.add("Rahul");

        // Typecasting is not need
        String s1 = a1.get(0);
        String s2 = a1.get(1);

        System.out.println(s1);
        System.out.println(s2);
    }
}
