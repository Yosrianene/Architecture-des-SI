package tn.esprit.springbootautoloc.service.Equipement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.EQUIPEMENT.Equipement;
import tn.esprit.springbootautoloc.repository.Equipementrepository;

import java.util.List;

@Service
public class EquipementServiceImpl implements EquipementService {

    @Autowired
    private Equipementrepository equipementrepository;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementrepository.save(equipement);
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        return equipementrepository.save(equipement);
    }

    @Override
    public void supprimerEquipement(Long id) {
        equipementrepository.deleteById(id);
    }

    @Override
    public Equipement recupererEquipement(Long id) {
        return equipementrepository.findById(id).orElse(null);
    }

    @Override
    public List<Equipement> recupererTousLesEquipements() {
        return equipementrepository.findAll();
    }
}