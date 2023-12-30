package diary;

import jakarta.persistence.*;

@Entity
@Table(name = "event_categories")
public class EventCategory {
    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntry event;
}
