public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();
        System.out.println();
        task10();
    }

    public static void task1() {
        System.out.println("Задача №1");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача №2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача №3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача №4");
        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача №5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача №6");
        for (int i = 7; i < 99; i = i + 7) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача №7");
        for (int i = 1; i < 513; i = i * 2) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача №8");
        int accumulation = 29_000;
        int totalAccumulation = 0;
        for (int i = 1; i <= 12; i++) {
            totalAccumulation = totalAccumulation + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalAccumulation + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача №9");
        int accumulation = 29_000;
        double totalAccumulation = 0;
        for (int i = 1; i <= 12; i++) {
            totalAccumulation = totalAccumulation + totalAccumulation / 100;
            totalAccumulation = totalAccumulation + accumulation;
            String result = String.format("%.2f", totalAccumulation);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача №10");
        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + (i * 2));
        }
    }
}