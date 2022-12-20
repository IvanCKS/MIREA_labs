package lab1;

public class Class3
{
    public static void main(String[] args)
    {
        System.out.println("Аргументы командной строки");
        for(int i = 0; i<args.length; i++)
        {
            System.out.println(args[i]);
            if ( args[i].equals("-r"))
                System.out.println("REBOOT");
        }
    }
}
