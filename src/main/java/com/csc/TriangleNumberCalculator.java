package com.csc;
import java.util.ArrayList;
import java.util.List;

public class TriangleNumberCalculator {

    public int value(int n) {
        if (n == 1) {
            return 1;
        }
        return n + value(n - 1);
    }

    public int add(int n, int m) {
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    public int multiply(int n, int m) {
        return value(n) * value(m);
    }

    public double divide(int n, int m) {
        return (double) value(n) / value(m);
    }

    public List<Integer> sequence(int n) {
        List<Integer> sequenceList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sequenceList.add(value(i));
        }
        return sequenceList;
    }

    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        System.out.println("Multiply(3, 4): " + calculator.multiply(3, 4)); 
        System.out.println("Divide(4, 2): " + calculator.divide(4, 2)); 
        System.out.println("Sequence(5): " + calculator.sequence(5)); 
}

}
