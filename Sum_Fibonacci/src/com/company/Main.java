package com.company;

public class Main {

    public static int Fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }



    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; ++i) {
            if (Fibonacci(i) < 100)
            sum += Fibonacci(i);
        }
        System.out.println(sum);
    }
}

