package lab2.Author;

import java.util.Scanner;
import java.lang.*;

public class TestAuthor
{
    public static void main(String[] args)
    {
        String name = "имя";
        String email = "pochta@mail.ru";
        char gender = 'M';
        String email1;
        Author n = new Author(name, email, gender);
        System.out.println("Автор - " + n.getName() + ", Почта - " + n.getEmail() + ", Пол - " + n.getGender());
        Scanner input = new Scanner(System.in);

        System.out.println("Введите почту: ");
        email1 = input.nextLine();
        n.setEmail(email1);

        System.out.println(n.toString());
    }
}
