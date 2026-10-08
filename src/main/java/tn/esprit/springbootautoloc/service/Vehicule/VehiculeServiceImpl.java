package tn.esprit.springbootautoloc.service.Vehicule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.VEHICULE.Vehicule;
import tn.esprit.springbootautoloc.repository.Vehiculerepository;

import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {

    @Autowired
    private Vehiculerepository vehiculerepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculerepository.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculerepository.save(vehicule);
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculerepository.deleteById(id);
    }

    @Override
    public Vehicule recupererVehicule(Long id) {
        return vehiculerepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> recupererTousLesVehicules() {
        return vehiculerepository.findAll();
    }
}