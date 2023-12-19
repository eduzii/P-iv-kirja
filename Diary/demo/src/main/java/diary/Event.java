package diary;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;

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

