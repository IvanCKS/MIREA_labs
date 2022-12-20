package Homework18__.Task4;

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

        catch (ArithmeticException exception)
        {
            System.out.println("Ошибка! Деление на ноль!");
        }

        finally //выполняется независимо от того, появляются ли исключения
        {
            System.out.println("Программа была выполнена! finally выполняется в любом случае");
        }

    }

    public static void main(String[] args)
    {
       Tester tester = new Tester();

        tester.exceptionDemo();
    }
}
