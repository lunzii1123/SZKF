package MODELS;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Trainers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    long id;
    @Getter @Setter
    String firstName;
    @Getter @Setter
    String secondName;
    @Getter @Setter
    String description;
    @OneToMany(mappedBy = "trainers")
    private Set<Client> clientSet;
}
