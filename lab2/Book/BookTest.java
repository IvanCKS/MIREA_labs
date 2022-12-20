package lab2.Book;

import java.util.*;

public class BookTest
{
    public static void main(String[] args) {
        Shelf shelf = new Shelf(new ArrayList<>(Arrays.asList(new Book("автор1", "книга1", 2077), new Book("автор2", "книга2", 2042))));

        System.out.println(shelf);
        System.out.println(shelf.getLatestBook());
        System.out.println(shelf.getEarliestBook());
        shelf.orderByDate();


    }
}
