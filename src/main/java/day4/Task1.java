package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int numbers[] = new int[n];
        for (int i =0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: "  + numbers.length);

        int count = 0;
        int countZero = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;

        for (int number:numbers) {

            if (number > 8) {
                count++;
            } else if ( number ==0) {
                countZero++;
            } else if (number%2 != 0) {
                countOdd++;
            } else if (number%2 == 0) {
                countEven++;}
            sum = sum + number;
        }

        System.out.println("Количество чисел больше 8: " + count);
        System.out.println("Количество чисел равных 1: " + countZero);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
