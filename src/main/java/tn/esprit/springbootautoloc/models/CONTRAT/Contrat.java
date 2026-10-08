package tn.esprit.springbootautoloc.models.CONTRAT;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.PAIEMANT.Paiement;
import tn.esprit.springbootautoloc.models.RESERVATION.Reservation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "contratt")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

    // Reservation 1 ---- 1 Contrat
    @OneToOne
    @JoinColumn(name = "id_reservation", unique = true)
    private Reservation reservation;

    // Contrat 1 ---- * Paiement
    @OneToMany(mappedBy = "contrat")
    private List<Paiement> paiements;
}