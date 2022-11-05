public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);

//        входные параметры для операции minus были изменены, так как иначе выдавалась ошибка от деления на 0
        int b = calc.minus.apply(2, 1);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);

        int d = calc.abs.apply(-15);
        calc.println.accept(d);

        int e = calc.abs.apply(15);
        calc.println.accept(e);
    }
}