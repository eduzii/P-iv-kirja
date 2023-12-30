package diary;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="entries")
public class EventEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="entry_date")
    @Temporal(TemporalType.DATE)
    private Date entryDate;

    // Constructors
    public EventEntry(String title, String content) {
        this.title = title;
        this.content = content;
        this.entryDate = new Date();
    }

    public EventEntry() {
    }


    public void setEntryDate(Date date) {
        this.entryDate = date;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getEntryDate() {
        return entryDate;
    }
}