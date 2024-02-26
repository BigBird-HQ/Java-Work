package diaryApp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDate dateCreated;
    private LocalTime timeCreated;


    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDate.now();
        this.timeCreated = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")))
    }

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return id +" "+  title +" "+ body +" "+ dateCreated +" "+ timeCreated;

    }


}
