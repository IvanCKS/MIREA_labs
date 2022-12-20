package lab6.Homework6_3;

import java.util.Scanner;

public class main implements Convertable{

    main(int temp)
    {
        convert(temp);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите t℃: ");
        int temp = input.nextInt();
        new main(temp);

    }

    @Override
    public void convert(int temp) {

        System.out.println("Температура в Ф = "+(1.8*temp+32));
        System.out.println("Температура в К = "+(temp+273.15));

    }
}
