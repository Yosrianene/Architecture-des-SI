package tn.esprit.springbootautoloc.models.RESERVATION;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "reservvation")
@Entity
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
}