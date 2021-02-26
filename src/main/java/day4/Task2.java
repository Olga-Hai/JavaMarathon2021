package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(1000);
        }
        int max = 0;
        int min = 0;
        int count5 = 0;
        int sum = 0;
        for (int number : numbers) {

            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            } else if (number%10 == 0) {
                count5++;
            } else if (number%10 == 0) {
                sum = sum + number;
            }
        }
        System.out.println(max + " - наибольший элемент массива");
        System.out.println(min + " - наименьший элемент массива");
        System.out.println(count5 + " - количество элементов массива, оканчивающихся на 0");
        System.out.println(sum + " - сумма элементов массива, оканчивающихся на 0");
    }
}