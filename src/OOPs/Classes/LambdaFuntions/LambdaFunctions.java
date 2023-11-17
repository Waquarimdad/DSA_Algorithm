package OOPs.Classes.LambdaFuntions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        list.forEach((item) -> {
            System.out.println(item * 2);
        });
        /*
            Both are doing same but here i am using consumer interface and storing the lambda expression and printing it.
            (item) -> {
            System.out.println(item * 2) this corresponds to the Consumer functional interface.
         */
        Consumer<Integer> consumer = (item) -> {
            System.out.println(item * 2);
        };
        list.forEach(consumer);

        System.out.println("We r doing stuff related to lambda expression below:");

        Operation sum = (a, b) -> {
            return (a + b);
        };
        Operation product = (a, b) -> {
            return (a * b);
        };
        Operation subtract = (a, b) -> {
            return (a - b);
        };

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(3,4,sum));
        System.out.println(myCalculator.operate(6,9,product));
        System.out.println(myCalculator.operate(3,4,subtract));

        /*
            Lambda functions: (parameters) -> expression
            Here, parameters represent the input parameters, and expression represents the body of the lambda expression.
            If the lambda expression takes no parameters, you can use an empty set of parentheses ().
         */

        Runnable runnable = () -> {
            System.out.println("Hello from a lambda expression!");
        };


        // Running the Runnable
        new Thread(runnable).start();
        /*
            names = Arrays.asList("Salman", "Alan Walker", "John Doe") this are corresponds to the Consumer functional interface.
         */
        List<String> names = Arrays.asList("Salman", "Alan Walker", "John Doe");
        names.forEach(name -> {
            System.out.println("Hello, " + name);
        });
    }

    private int operate(int a, int b, Operation operation) {
        return operation.operation(a,b);
    }
}
interface Operation {
    int operation(int a, int b);
}
