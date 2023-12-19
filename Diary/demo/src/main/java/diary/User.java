package diary;
import jakarta.persistence.*;
import jdk.jfr.Category;
import jdk.jfr.Event;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name="users")
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int userId;

    @Column(name="name")
    private String username;



}
