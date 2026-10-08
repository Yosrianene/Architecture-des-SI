package tn.esprit.springbootautoloc.service.Agence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.AGENCE.Agence;
import tn.esprit.springbootautoloc.repository.Agencerepository;

import java.util.List;

@Service
public class AgenceServiceImpl implements AgenceService {

    @Autowired
    private Agencerepository agencerepository;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agencerepository.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agencerepository.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agencerepository.deleteById(id);
    }

    @Override
    public Agence recupererAgence(Long id) {
        return agencerepository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> recupererToutesLesAgences() {
        return agencerepository.findAll();
    }
}