package tn.esprit.springbootautoloc.models.CLIENT;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.RESERVATION.Reservation;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "clientt")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String numPermis;
    private LocalDate dateInscription;

    // Client 1 ---- * Reservation
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;
}