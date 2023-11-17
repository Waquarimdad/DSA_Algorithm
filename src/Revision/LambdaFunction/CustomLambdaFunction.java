package Revision.LambdaFunction;

import java.util.Arrays;
import java.util.List;

public class CustomLambdaFunction {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Salman Khan", "John Abraham", "John Doe");
        /*
            (items) -> {
            System.out.println(items + " "); this we call Consumer
            A Consumer in Java is a functional interface that takes a single input and performs some operation on it. It does not return any value.
            Consumers are commonly used with lambda expressions to perform operations on collections of data.
         */
        names.forEach((items) -> {
            System.out.println(items + " ");
        });
        /*
            :: is called method reference.
         */
        LambdaOperation addition = Integer::sum;
        LambdaOperation product = (a, b) -> a * b;

        CustomLambdaFunction lambdaFunction = new CustomLambdaFunction();
        System.out.println(lambdaFunction.operations(4, 6, addition));
        System.out.println(lambdaFunction.operations(1010101, 24, product));
    }
    private int operations(int a, int b, LambdaOperation operation) {
        return operation.operations(a,b);
    }
}

interface LambdaOperation {
    int operations(int a, int b);
}