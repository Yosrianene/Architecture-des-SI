package tn.esprit.springbootautoloc.models.EMPLOYE;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "employye")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;
}