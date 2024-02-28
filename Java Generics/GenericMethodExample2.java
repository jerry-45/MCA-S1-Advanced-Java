/* Program that prints an array of different type using a single Generic Method */

public class GenericMethodExample2{
    //generic method printArray
    public static <E> void printArray(E[] inputArray){
        //display array elements
        for(E element : inputArray){
            System.out.printf("%s\t", element);
        }
        System.out.println();
    }

    public static void main(String args[]){
        //create arrays of Integer, Double and Character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println("Array intergerArray contains:");
        printArray(intArray);   //pass an Integer Array

        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);   //pass an Double Array

        System.out.println("Array characterArray contains:");
        printArray(charArray);   //pass an Character Array
    }
}
