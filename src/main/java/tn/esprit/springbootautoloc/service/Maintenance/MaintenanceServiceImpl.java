package tn.esprit.springbootautoloc.service.Maintenance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.MAINTENANCE.Maintenance;
import tn.esprit.springbootautoloc.repository.Maintenancerepository;

import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    private Maintenancerepository maintenancerepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenancerepository.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenancerepository.save(maintenance);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenancerepository.deleteById(id);
    }

    @Override
    public Maintenance recupererMaintenance(Long id) {
        return maintenancerepository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> recupererToutesLesMaintenances() {
        return maintenancerepository.findAll();
    }
}