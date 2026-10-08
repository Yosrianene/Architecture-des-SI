package tn.esprit.springbootautoloc.models.EQUIPEMENT;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.springbootautoloc.models.VEHICULE.Vehicule;

import java.util.List;

@Entity
@Table(name = "equipementt")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    private String libelle;

    // Equipement * ---- * Vehicule
    @ManyToMany
    @JoinTable(
            name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "id_equipement"),
            inverseJoinColumns = @JoinColumn(name = "id_vehicule")
    )
    private List<Vehicule> vehicules;
}