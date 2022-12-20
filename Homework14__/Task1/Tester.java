package Homework14__.Task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        Scanner input = new Scanner(System.in);

        String string = input.nextLine();

        Pattern pattern = Pattern.compile("(([a-z]+)|((\\d+)))");
        Matcher matcher = pattern.matcher(string);

        List<Object> tokens = new LinkedList<>();
        while(matcher.find())
        {
            String token = matcher.group();
            tokens.add(token);
        }
        System.out.println(tokens);

    }
}
