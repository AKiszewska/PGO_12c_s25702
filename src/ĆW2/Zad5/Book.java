package ĆW2.Zad5;


import java.time.LocalDate;
import java.time.*;

public class Book {
    private Long ID = System.currentTimeMillis();
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private Person author;
    private Person borrowedBy;
    private int borrowCount;
    private boolean isAvailable;


    public Book() {
    }

    public Book(String name, Genre genre, Lang language, LocalDate publishDate, Person author) {
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.publishDate = publishDate;
        this.author = author;


    }


    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            throw new RuntimeException("Wartość name nie może być pusta");
        } else {
            this.name = name;
        }
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLanguage() {
        return language;
    }

    public void setLanguage(Lang language) {
        this.language = language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public int getAge() {
        if (this.publishDate != null) {
            return Period.between(this.publishDate, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    private void addBorrowCount() {
        this.borrowCount++;
    }

    public boolean isAvailable() {
        return this.borrowedBy == null;
    }

    public void placeBack() {
        isAvailable = true;
        borrowedBy = null;
    }

    public void borrowBook(Person person) {
        if (isAvailable = true) {
            borrowedBy = person;
            borrowCount++;
            isAvailable = false;
        } else {
            System.out.println("Książka jest aktualnie wypożyczone");
        }
    }
}




