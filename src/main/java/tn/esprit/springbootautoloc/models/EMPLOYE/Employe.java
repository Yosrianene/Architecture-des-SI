package tn.esprit.springbootautoloc.models.EMPLOYE;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.AGENCE.Agence;

@Entity
@Table(name = "employye")
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

    // Plusieurs employés appartiennent à une agence
    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;
}