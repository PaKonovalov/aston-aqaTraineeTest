import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
    }

    static void firstTask() {
        System.out.println("Task 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”\n" +
                "Введите число:");

        Scanner scannerFirstTask = new Scanner(System.in);
        int number = scannerFirstTask.nextInt();
        while (number <= 7) {
            number = scannerFirstTask.nextInt();
        }
        System.out.println("Привет");
    }

    static void secondTask() {
        System.out.println("\nTask 2. Составить алгоритм: если введенное имя совпадает с Вячеслав, " +
                "то вывести “Привет, Вячеслав”, если нет, то вывести ”Нет такого имени”\n" +
                "Введите имя:");

        Scanner scannerSecondTask = new Scanner(System.in);
        final String correctName = "Вячеслав";
        while (true) {
            String inputName = scannerSecondTask.nextLine();
            if (inputName.equals(correctName)) {
                System.out.println("Привет, Вячеслав");
                break;
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }

    static void thirdTask() {
        System.out.println("\nTask 3. Составить алгоритм: на входе есть числовой массив, " +
                "необходимо вывести элементы массива кратные 3");

        int[] arrayData = {1, 2, 3, 6, 9, 4, 12, 15, 17, 18, 21, 24, 20, 18, 55};
        for (int arrayD : arrayData) {
            if ((arrayD % 3) == 0) {
                System.out.print(arrayD + " ");
            }
        }
    }

    static void fourthTask() {
        System.out.println("\n\nTask 4. Дана скобочная последовательность: [((())()(())]]\n" +
                "- Можно ли считать эту последовательность правильной?\n" +
                "- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?\n" +
                "Ответ: скобочная последовательность не верна. Правильная последовательность выглядит следующим образом: " +
                "[[(())()(())]]");
    }
}
