package review.solid.SingleResponsibilityPrinciple;

import java.time.LocalDate;

public class Book {
    private final int RETURN_DATE = 30;
    private String title;
    private String genre;
    private String author;
    private LocalDate rentDate = LocalDate.now();

    public Book(){

    }

    public Book(String title){
        this.title = title;
    }

    public int getRETURN_DATE() {
        return RETURN_DATE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "RETRUN_DATE=" + RETURN_DATE +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", rentDate=" + rentDate +
                '}';
    }
}
