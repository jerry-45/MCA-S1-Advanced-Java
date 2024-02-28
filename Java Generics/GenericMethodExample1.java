/* Program that prints the type of data passed using a Generic Method */

public class GenericMethodExample1{
    //generic method print
    public static <T> void print(T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String args[]){
        GenericMethodExample1.print("Hello World");
        GenericMethodExample1.print(100);
    }
}