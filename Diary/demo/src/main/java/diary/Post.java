package diary;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String eventTitle;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String eventDescription;

    @Column
    private Date eventDate;

    @Column
    private Time eventTime;

    @Column
    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime updated;

    @PrePersist
    protected void Create(){
        created = LocalDateTime.now();
    }

    @PreUpdate
    protected void Update(){
        updated = LocalDateTime.now();
    }

}
