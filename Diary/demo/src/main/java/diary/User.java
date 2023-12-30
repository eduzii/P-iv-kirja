package diary;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="users")
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int userId;

    @Column(name="username")
    private String username;

    @Column(name="password_hash")
    private String passwordHash;

}
