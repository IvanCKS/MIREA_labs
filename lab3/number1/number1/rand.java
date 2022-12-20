package lab3.number1.number1;
import java.util.*;

public class rand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число n");
        int n = scan.nextInt();
        double[] array = new double[n];
        System.out.print("1 способ" + '\n');
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 100;
            System.out.print((((double) Math.round(array[i] * 100) / 100)) + " ");
        }
        System.out.print('\n');
        Arrays.sort(array);
        for (int k = 0; k < array.length; k++)
            System.out.print((((double) Math.round(array[k] * 100) / 100)) + " ");
        System.out.print('\n');
        System.out.print("2 способ" );
        System.out.print('\n');
        System.out.println("Введите число n");

        generate(n = scan.nextInt());

    }
    public static void generate(int n){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
            System.out.print((((double) Math.round(array[i] * 100) / 100)) + " ");
        }
        System.out.print('\n');
        Arrays.sort(array);
        for (int k = 0; k < array.length; k++)
            System.out.print((((double) Math.round(array[k] * 100) / 100)) + " ");

    }

}

