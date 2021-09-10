package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.Book;


public class BookTest {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите название книги: ");
    String bookTitle = IN.nextLine();

    System.out.print("Введите имя автора книги: ");
    String bookAuthor = IN.nextLine();

    System.out.print("Введите год выхода книги: ");
    int bookYear = IN.nextInt();

    Book book = new Book();

    book.setTitle(bookTitle);
    book.setAuthor(bookAuthor);
    book.setYear(bookYear);

    System.out.println();
    System.out.println("Автором книги " + book.getTitle() + ", которая вышла в " + book.getYear() + ", является " + book.getAuthor());
  }
}
