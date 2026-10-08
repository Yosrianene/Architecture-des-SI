package tn.esprit.springbootautoloc.service.Maintenance;

import tn.esprit.springbootautoloc.models.MAINTENANCE.Maintenance;

import java.util.List;

public interface MaintenanceService {

    Maintenance ajouterMaintenance(Maintenance maintenance);

    Maintenance modifierMaintenance(Maintenance maintenance);

    void supprimerMaintenance(Long id);

    Maintenance recupererMaintenance(Long id);

    List<Maintenance> recupererToutesLesMaintenances();
}