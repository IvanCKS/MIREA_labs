package lab3.number1.number6;
import java.util.*;

import java.text.DecimalFormat;
public class rand6 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat();

        double d;
        int c = 12590;
        int b = 3500;
        Scanner scan = new Scanner(System.in);
        System.out.println("1 товар " + c  + "руб. ");
        System.out.println("2 товар " + b + "руб. ");
        int v;
        System.out.println("доступная валюта - доллар (1), евро (2)");
        v = scan.nextInt();
        switch (v) {
            case 1:
                d = c / 68;
                System.out.println("1 товар " + f.format(d) + " доллар. ");
                d = b / 68;
                System.out.println("2 товар " + f.format(d) + " доллар. ");
                break;
            case 2:
                d = c / 75;
                System.out.println("1 товар " + f.format(d) + " евро. ");
                d = b / 75;
                System.out.println("2 товар " + f.format(d) + " евро. ");
        }
    }
}
