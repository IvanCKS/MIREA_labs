package lab3.number1.number2;
import java.util.*;
public class rand2 {
    public static void main(String[] args) {
        int a[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = (new Random()).nextInt(10, 99);
            System.out.print(a[i] + " ");
        }

        System.out.print('\n');
        for(int c = 1; c < a.length; c++ ) {
                if (a[c - 1] >= a[c]) {
                    System.out.println("не возрастающая");
                    break;
                }
                if (c == a.length - 1)
                    System.out.println("возрастающая");

        }

    }
}