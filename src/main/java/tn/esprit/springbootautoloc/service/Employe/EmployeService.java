package tn.esprit.springbootautoloc.service.Employe;

import tn.esprit.springbootautoloc.models.EMPLOYE.Employe;

import java.util.List;

public interface EmployeService {

    Employe ajouterEmploye(Employe employe);

    Employe modifierEmploye(Employe employe);

    void supprimerEmploye(Long id);

    Employe recupererEmploye(Long id);

    List<Employe> recupererTousLesEmployes();
}