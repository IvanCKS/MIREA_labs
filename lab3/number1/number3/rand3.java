package lab3.number1.number3;

import java.util.*;


public class rand3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        System.out.println("Введите число n");
        while (n <= 0) {
            if (scan.hasNextInt())
                n = scan.nextInt();
            else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                scan.next();
            }
        }
        int array[] = new int[n];
        int nn = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, n);
            if(array[i]%2 == 0) nn++;
            System.out.print((array[i]) + " ");
        }
        System.out.print('\n');
        int array2[] = new int[nn];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                array2[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < array2.length; i++) System.out.print(array2[i] + " ");

    }
}