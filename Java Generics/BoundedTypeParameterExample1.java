/* Program that calculates the average of numbers either integer or double */

public class BoundedTypeParameterExample1<T extends Number>{
    T[] numArr;
    BoundedTypeParameterExample1(T[] numArr){
        this.numArr = numArr;
    }

    public double getAvg(){
        double sum = 0.0;
        for(int i = 0; i < numArr.length; i++){
            sum += numArr[i].doubleValue();
        }

        double avg = sum / numArr.length;
        return avg;
    }

    public static void main(String[] args){
        Integer i[] = {12,13,14,15,16};
        Double d[] = {1.0,2.0,3.0,4.0};

        BoundedTypeParameterExample1<Integer> e1 = new BoundedTypeParameterExample1<Integer>(i);
        BoundedTypeParameterExample1<Double> e2 = new BoundedTypeParameterExample1<Double>(d);

        Double ai = e1.getAvg();
        Double ad = e2.getAvg();

        System.out.println("Average of Integers: " + ai);
        System.out.println("Average of Double: " + ad);
    }
}
