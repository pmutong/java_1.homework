package ru.geekbrains;

public class Main {

    // написать метод, выч. выр. a * (b + (c / d)) и
    // возвр. рез-т, где a, b, c, d - входные параметры этого метода.

    private static float calculate(int a, int b, int c, int d) {
        return a * (b + (c * 1f / d));
    }

    //Написать метод, принимающий на вход два целых числа,
    // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;

    private static boolean numbers(int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }

    //  Написать метод, которому в качестве параметра передается целое число,
    //  метод должен проверить положительное ли число передали, или отрицательное.
    //  Замечание: ноль считаем положительным числом.
    //  Результат работы метода вывести в консоль

    private static boolean num2(int num) {
        return num >= 0;
    }

    // Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя, метод должен вернуть приветственное сообщение
    // «Привет, переданное_имя!»; Вывести приветствие в консоль.

    private static String hello(String name) {
        return "Привет, " + name + "!";
    }

    // Написать метод, который определяет является ли год високосным.
    // Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный. Для проверки работы вывести
    // результаты работы метода в консоль

    private static boolean yesSirYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        final int varOne = 1; // ???
        final int varTwo = 2; // ???
        final int varThree = 3; // ???
        final int varFour = 4; // ???

        final float fOne = 1f; // ???
        final float fTwo = 2f; // ???
        final float fThree = 3f; // ???
        final float fFour = 4.0f; // ??? ???

        System.out.println("Calculation from the first task gives us: " + calculate(varOne, varTwo, varThree, varFour));

        System.out.println("Does the sum of two given numbers fit the range? " + numbers(6, 13));

        System.out.println("Your number is " + ((num2(-5)) ? "positive" : "negative") + "!");

        System.out.println(hello("Suakhili"));

        System.out.println("Is the given year leap? " + yesSirYear(1700));
    }
}