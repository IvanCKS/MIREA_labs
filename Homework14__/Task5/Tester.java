package Homework14__.Task5;

import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester
{
    public static void main(String[] args)
    {
        System.out.println("Введите дату формата dd/mm/yyyy: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        if(checkString(string) == true)
        {
            System.out.println("Введённая дата подходит под условие задачи!");
        }
        else System.out.println("Дата не подходит под условие задачи!");
    }

    private static boolean checkString(final String string)
    {
        Pattern pattern = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$");
        Matcher m = pattern.matcher(string);
        boolean result = m.matches();

        return result;
    }
}
