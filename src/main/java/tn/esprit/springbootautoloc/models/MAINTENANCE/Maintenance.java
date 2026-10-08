package tn.esprit.springbootautoloc.models.MAINTENANCE;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.VEHICULE.Vehicule;

import java.time.LocalDate;

@Entity
@Table(name = "maintenancce")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;

    // Plusieurs maintenances concernent un véhicule
    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicule;
}