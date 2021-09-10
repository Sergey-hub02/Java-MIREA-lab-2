package ru.mirea.classes;

public class Book {
  private String title;
  private String author;
  private int year;

  /**
   * Конструктор по умолчанию
   */
  public Book() {
    this.title = "Unnamed Book";
    this.author = "Anonymous";
    this.year = 0;
  }

  /**
   * Конструктор, создающий полноценную книгу
   * @param title         название книги
   * @param author        автор книги
   * @param date          год выхода книги
   */
  public Book(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  /**
   * Возвращает название книги
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Изменяет значение поля title
   * @param newTitle        новое название книги
   */
  public void setTitle(String newTitle) {
    this.title = newTitle;
  }

  /**
   * Возвращает имя автора книги
   */
  public String getAuthor() {
    return this.author;
  }

  /**
   * Изменяет значение поля author
   * @param newAuthor         новый автор книги
   */
  public void setAuthor(String newAuthor) {
    this.author = newAuthor;
  }

  /**
   * Возвращает год выхода книги
   */
  public int getYear() {
    return this.year;
  }

  /**
   * Изменяет значение поля year
   * @param year        новая год выхода книги
   */
  public void setYear(int newYear) {
    this.year = newYear;
  }
}
