package Week_05.Book_Sorting;

import Week_02.Pasting_Letters.B;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Mein Kampf", 780, "Adolf Hitler", "18th July 1925");
        Book book2 = new Book("Diyet", 128, "Omer Seyfettin", "11th November 1935");
        Book book3 = new Book("Od", 361, "İskender Pala", "15th November 2016");
        Book book4 = new Book("Hayvan Ciftliği", 152, "George Orwell", "17th July 1945");
        Book book5 = new Book("Seker Portakalı", 200, "Vasconcelos", "1968");


        TreeSet<Book> set = new TreeSet<>();

        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        set.add(book5);

        System.out.println("Sort by book name :");
        System.out.println("----------------------");
        for (Book book : set) {
            System.out.println(book.getBookName() + ": " + book.getWriter() + "-" + book.getBookTotalPage());
        }
        System.out.println("===========================");

        TreeSet<Book> sortByPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookTotalPage() - o2.getBookTotalPage();
            }
        });
        sortByPage.add(book1);
        sortByPage.add(book2);
        sortByPage.add(book3);
        sortByPage.add(book4);
        sortByPage.add(book5);

        System.out.println("Sort by page number :");
        System.out.println("----------------------");
        for (Book book : sortByPage) {
            System.out.println(book.getBookName() + ": " + book.getWriter() + "-" + book.getBookTotalPage());
        }

    }
}
