package tn.esprit.springbootautoloc.service.Contrat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.CONTRAT.Contrat;
import tn.esprit.springbootautoloc.repository.Contratrepository;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {

    @Autowired
    private Contratrepository contratrepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratrepository.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratrepository.save(contrat);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratrepository.deleteById(id);
    }

    @Override
    public Contrat recupererContrat(Long id) {
        return contratrepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> recupererTousLesContrats() {
        return contratrepository.findAll();
    }
}