package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.CONTRAT.Contrat;

public interface Contratrepository extends JpaRepository<Contrat, Long> {
}