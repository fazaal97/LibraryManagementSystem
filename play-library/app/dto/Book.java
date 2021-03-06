package dto;

import java.util.List;

public class Book extends LibraryItem {

    private List<Author> authors;
    private String publisher;
    private int totalnoPages;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getTotalnoPages() {
        return totalnoPages;
    }

    public void setTotalnoPages(int totalnoPages) {
        this.totalnoPages = totalnoPages;
    }
}
