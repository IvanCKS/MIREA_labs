package Homework11__.Task1;

import java.util.Date;
import java.util.Scanner;

public class PassDate
{
    public static void main(String[] args)
    {
        System.out.println("Фамилия разработчика: ");
        Scanner in = new Scanner(System.in);
        String sname = in.next();
        Date date = new Date();
        System.out.println("Дата получения задания: понедельник июль 31 16:20:01 Москва 2077"
                +"\n"
                + "Фамилия разработчика: " + sname
                + "\n"
                + "Дата и время сдачи задания: " + date);
    }
}
