package tn.esprit.springbootautoloc.service.Agence;

import tn.esprit.springbootautoloc.models.AGENCE.Agence;

import java.util.List;

public interface AgenceService {

    Agence ajouterAgence(Agence agence);

    Agence modifierAgence(Agence agence);

    void supprimerAgence(Long id);

    Agence recupererAgence(Long id);

    List<Agence> recupererToutesLesAgences();
}