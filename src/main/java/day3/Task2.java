package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        while (true) {
            Scanner s = new Scanner(System.in);
            double x = s.nextDouble();
            double y = s.nextDouble();
            if (y == 0) break;
            System.out.println(x / y);
        }

    }
}
