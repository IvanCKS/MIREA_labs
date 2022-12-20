package Homework19__;

import java.util.Scanner;

public class Tester
{
    static  boolean search = false;

    public static Student[] arr =
            {
                    new Student("Валеев", "Иван", 1  ),
                    new Student("В", "Г",2  ),

            };

    public static void main(String[] args) throws M_Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите студента: ");
        String surname = input.nextLine();
        findUser(surname);
    }

    private static void findUser(String surname) throws M_Exception
    {

        try
        {
            String[] split = surname.split(" ");
            for (int i = 0; i < arr.length; i++)
            {
                if (split[1].equals(arr[i].getSname()))
                {
                    search = true;
                    if ((arr[i].getName().equals(split[0])))
                     {
                         System.out.println(arr[i].toString());
                     }
                    else
                    search = false;
            }
        }
                if (!search)
                     {
                          throw new M_Exception("Студент не найден!");
                     }
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("ФИ студента некорректны!");
        }

    }
}
