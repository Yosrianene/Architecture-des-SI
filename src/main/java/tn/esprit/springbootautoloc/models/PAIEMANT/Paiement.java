package tn.esprit.springbootautoloc.models.PAIEMANT;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.CONTRAT.Contrat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paiiement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;

    private BigDecimal montant;
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;

    // Plusieurs paiements appartiennent à un contrat
    @ManyToOne
    @JoinColumn(name = "id_contrat")
    private Contrat contrat;
}