package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int i = 0;

        while (i < 4) {
            Scanner s = new Scanner(System.in);
            double x = s.nextDouble();
            double y = s.nextDouble();
            if (y == 0) continue;
            System.out.println(x / y);
            i++;
        }

    }
}
