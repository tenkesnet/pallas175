import java.util.function.IntBinaryOperator;

public class Calculator {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public static int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 +  2 = " + Calculator.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + Calculator.operateBinary(20, 10, subtraction));

        // ugyanez beépített eszközökkel (nem tananyag)
        IntBinaryOperator add = (a, b) -> a + b;
        IntBinaryOperator sub = (a, b) -> a - b;
        System.out.println("40 +  2 = " + add.applyAsInt(40, 2));
        System.out.println("20 - 10 = " + sub.applyAsInt(20, 10));
    }
}
