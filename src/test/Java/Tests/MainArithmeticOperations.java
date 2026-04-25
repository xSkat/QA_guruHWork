package Tests;

public class MainArithmeticOperations {
    public static void main(String[] args) {
        // 0) Арифметические операции над двумя int
        System.out.println("=== 0) Операции над int ===");
        int a = 123;
        int b = 27;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        // 1) Операции над int и double
        System.out.println("\n=== 1) Операции над int и double ===");
        int c = 4;
        double d = 1.3;

        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));

        // 2) Логические операции сравнения
        System.out.println("\n=== 2) Операции сравнения ===");
        int x = 7;
        int y = 10;

        System.out.println(x + " < " + y + " = " + (x < y));
        System.out.println(x + " > " + y + " = " + (x > y));
        System.out.println(x + " >= " + y + " = " + (x >= y));
        System.out.println(x + " <= " + y + " = " + (x <= y));
        System.out.println(x + " == " + y + " = " + (x == y));
        System.out.println(x + " != " + y + " = " + (x != y));

        // 3) Диапазоны вещественных чисел
        System.out.println("\n=== 3) Диапазоны float и double ===");
        System.out.println("float:");
        System.out.println("  Максимум: " + Float.MAX_VALUE);
        System.out.println("  Минимум: " + Float.MIN_VALUE);
        System.out.println("double:");
        System.out.println("  Максимум: " + Double.MAX_VALUE);
        System.out.println("  Минимум: " + Double.MIN_VALUE);

        // 4) Переполнение
        System.out.println("\n=== 4) Переполнение ===");
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Максимальный int: " + maxInt);
        System.out.println("maxInt + 1 = " + (maxInt + 1)); // переполнение!

        int minInt = Integer.MIN_VALUE;
        System.out.println("Минимальный int: " + minInt);
        System.out.println("minInt - 1 = " + (minInt - 1)); // переполнение!
    }
}

