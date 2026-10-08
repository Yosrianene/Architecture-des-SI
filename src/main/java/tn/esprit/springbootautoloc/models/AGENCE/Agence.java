package tn.esprit.springbootautoloc.models.AGENCE;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.EMPLOYE.Employe;
import tn.esprit.springbootautoloc.models.VEHICULE.Vehicule;

import java.util.List;

@Entity
@Table(name = "agence")
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

    // Une agence possède plusieurs employés
    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;

    // Une agence possède plusieurs véhicules
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}