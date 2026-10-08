package tn.esprit.springbootautoloc.service.Paiemant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.PAIEMANT.Paiement;
import tn.esprit.springbootautoloc.repository.Paiementrepository;

import java.util.List;

@Service
public class PaiemantServiceImpl implements PaiemantService {

    @Autowired
    private Paiementrepository paiementrepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementrepository.save(paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paiementrepository.save(paiement);
    }

    @Override
    public void supprimerPaiement(Long id) {
        paiementrepository.deleteById(id);
    }

    @Override
    public Paiement recupererPaiement(Long id) {
        return paiementrepository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> recupererTousLesPaiements() {
        return paiementrepository.findAll();
    }
}