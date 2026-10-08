package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.EQUIPEMENT.Equipement;

public interface Equipementrepository extends JpaRepository<Equipement, Long> {
}