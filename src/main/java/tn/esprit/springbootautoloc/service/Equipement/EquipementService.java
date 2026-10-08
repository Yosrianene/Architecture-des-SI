package tn.esprit.springbootautoloc.service.Equipement;

import tn.esprit.springbootautoloc.models.EQUIPEMENT.Equipement;

import java.util.List;

public interface EquipementService {

    Equipement ajouterEquipement(Equipement equipement);

    Equipement modifierEquipement(Equipement equipement);

    void supprimerEquipement(Long id);

    Equipement recupererEquipement(Long id);

    List<Equipement> recupererTousLesEquipements();
}