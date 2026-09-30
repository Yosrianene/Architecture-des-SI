package tn.esprit.springbootautoloc.models.EQUIPEMENT;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "equipementt")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    private String libelle;
}