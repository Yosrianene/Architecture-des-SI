package tn.esprit.springbootautoloc.models.VEHICULE;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.AGENCE.Agence;
import tn.esprit.springbootautoloc.models.EQUIPEMENT.Equipement;
import tn.esprit.springbootautoloc.models.MAINTENANCE.Maintenance;
import tn.esprit.springbootautoloc.models.RESERVATION.Reservation;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "vehiculla")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    @Column(name = "imatricula", nullable = false)
    private String immatriculation;

    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    // Agence 1 ---- * Vehicule
    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;

    // Vehicule 1 ---- * Maintenance
    @OneToMany(mappedBy = "vehicule")
    private List<Maintenance> maintenances;

    // Vehicule * ---- * Equipement
    @ManyToMany(mappedBy = "vehicules")
    private List<Equipement> equipements;

    // Vehicule 1 ---- * Reservation
    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;
}