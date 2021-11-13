package bai4;

import java.util.Arrays;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> sum1= new Sum<>(1,2);
        System.out.println("Sum 2 số int: "+(sum1.getSoA()+sum1.getSoB()));
        Sum<Long> sum2= new Sum<>(1l,2l);
        System.out.println("Sum 2 số long: "+(sum2.getSoA()+sum2.getSoB()));
        Sum<Float> sum3= new Sum<>(1f,2f);
        System.out.println("Sum 2 số float: "+(sum3.getSoA()+sum3.getSoB()));
        Sum<Double> sum4= new Sum<>(1.222,2.222);
        System.out.println("Sum 2 số double: "+(sum4.getSoA()+sum4.getSoB()));
    }
}
