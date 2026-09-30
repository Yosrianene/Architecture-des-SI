package tn.esprit.springbootautoloc.models.AGENCE;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "agence")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
}