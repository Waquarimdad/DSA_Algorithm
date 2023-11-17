package OOPs.Classes.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
//            divide(a, b);
            String name = "Waqaur Imdad";
            if (name.equals("Waqaur Imdad")) {
                throw new CustomException("My name is incorrect");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this is always execute");
        }
    }
    static void divide(int a, int b) throws ArithmeticException {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Please don't divide by zero");
        }
        System.out.println("Answer: " + (a / b));
    }
}
