package lab8.nomer7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Введите число \n");
        int a = input.nextInt();


        for (int i = 2; ; i++) {
            if (a % i == 0) {
                System.out.println(i);
                a = a / i;


            }

        }
    }
}
