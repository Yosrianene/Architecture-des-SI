package tn.esprit.springbootautoloc.models.VEHICULE;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name="vehiculla")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idVehicule;

    @Column(name="imatricula", nullable=false)
    private  String immatriculation;
    private  String marque;
    private  String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

}
