package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] array = new int[8];
        int n = array.length;
        Exercise.Calculate(array, n);
    }
}
