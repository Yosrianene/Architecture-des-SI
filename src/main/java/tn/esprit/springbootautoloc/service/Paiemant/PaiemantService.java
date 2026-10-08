package tn.esprit.springbootautoloc.service.Paiemant;

import tn.esprit.springbootautoloc.models.PAIEMANT.Paiement;

import java.util.List;

public interface PaiemantService {

    Paiement ajouterPaiement(Paiement paiement);

    Paiement modifierPaiement(Paiement paiement);

    void supprimerPaiement(Long id);

    Paiement recupererPaiement(Long id);

    List<Paiement> recupererTousLesPaiements();
}