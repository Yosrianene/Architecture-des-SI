package tn.esprit.springbootautoloc.models.RESERVATION;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.CLIENT.Client;
import tn.esprit.springbootautoloc.models.CONTRAT.Contrat;
import tn.esprit.springbootautoloc.models.VEHICULE.Vehicule;

import java.time.LocalDate;

@Entity
@Table(name = "reservvation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    // Client 1 ---- * Reservation
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    // Vehicule 1 ---- * Reservation
    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicule;

    // Reservation 1 ---- 1 Contrat
    @OneToOne(mappedBy = "reservation")
    private Contrat contrat;
}