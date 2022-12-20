package Homework18__.Task3;

import java.util.Scanner;

public class Tester
{
    public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (Exception exception)
        {
            System.out.println("Ошибка!");
        }

    }

    public static void main(String[] args)
    {
        Tester tester = new Tester();

        tester.exceptionDemo();
    }
}
