import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0) {
            System.out.println("Ошибка! Деление на 0");
            return 0;
        }
        return x / y;
    };

    UnaryOperator<Integer> pow = (x) -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
//     данный подход с тернарным оператором работает корректно - реализация приведена в main
//     в качестве альтернативы ниже приведен альтернативный вариант с полноценным многострочным блоком кода
//
//    UnaryOperator<Integer> abs = x -> {
//        if(x > 0) {
//            return x;
//        }
//        return x * -1;
//    };

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}