package lab6.Homework6_2;

public class Main {
    public static void main(String[] args) {
        Printable[] print ={new Book ("книга1"),new Shop("журнал1"),
                new Book ("книга2"),new Book ("журнал2")};

        for(Printable pr:print)
                   pr.print();
    }
}
