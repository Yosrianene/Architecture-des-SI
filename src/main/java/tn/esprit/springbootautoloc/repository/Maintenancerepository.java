package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.MAINTENANCE.Maintenance;

public interface Maintenancerepository extends JpaRepository<Maintenance, Long> {
}