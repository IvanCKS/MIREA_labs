package lab3.number1.number5;
import java.util.*;
import java.text.DecimalFormat;
public class rand5 {
    public static void main(String[] args)
    {
        double a, r, d;
        int v;

        DecimalFormat f = new DecimalFormat();

        Scanner scan = new Scanner(System.in);
        System.out.println("1 - рубль");
        System.out.println("2 - доллар");

        System.out.print("Выберите вариант ");
        v = scan.nextInt();
        System.out.println("Введите сумму");
        a = scan.nextFloat();

        switch (v)
        {
            case 1:
                d = a / 68;
                System.out.println(a + " рубль = " + f.format(d) + " доллар");

                break;

            case 2:
                r = a * 68;
                System.out.println(a + " доллар = " + f.format(r) + " рубль");

                break;


        }
    }
}
