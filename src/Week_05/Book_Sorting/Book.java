package Week_05.Book_Sorting;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    String bookName;
    int bookTotalPage;
    String writer;
    String publishDate;

    public Book(String bookName, int bookTotalPage, String writer, String publishDate) {
        this.bookName = bookName;
        this.bookTotalPage = bookTotalPage;
        this.writer = writer;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookTotalPage() {
        return bookTotalPage;
    }

    public void setBookTotalPage(Integer bookTotalPage) {
        this.bookTotalPage = bookTotalPage;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }


    @Override
    public int compareTo(Book secondBook) {
        return this.bookName.compareTo(secondBook.getBookName());
    }

}
