package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.PAIEMANT.Paiement;

public interface Paiementrepository extends JpaRepository<Paiement, Long> {
}