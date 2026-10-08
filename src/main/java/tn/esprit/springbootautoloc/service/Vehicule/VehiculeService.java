package tn.esprit.springbootautoloc.service.Vehicule;

import tn.esprit.springbootautoloc.models.VEHICULE.Vehicule;

import java.util.List;

public interface VehiculeService {

    Vehicule ajouterVehicule(Vehicule vehicule);

    Vehicule modifierVehicule(Vehicule vehicule);

    void supprimerVehicule(Long id);

    Vehicule recupererVehicule(Long id);

    List<Vehicule> recupererTousLesVehicules();
}