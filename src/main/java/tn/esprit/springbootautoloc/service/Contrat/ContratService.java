package tn.esprit.springbootautoloc.service.Contrat;

import tn.esprit.springbootautoloc.models.CONTRAT.Contrat;

import java.util.List;

public interface ContratService {

    Contrat ajouterContrat(Contrat contrat);

    Contrat modifierContrat(Contrat contrat);

    void supprimerContrat(Long id);

    Contrat recupererContrat(Long id);

    List<Contrat> recupererTousLesContrats();
}