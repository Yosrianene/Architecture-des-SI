package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.VEHICULE.Vehicule;

public interface Vehiculerepository extends JpaRepository<Vehicule, Long> {
}