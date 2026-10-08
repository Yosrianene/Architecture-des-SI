package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.AGENCE.Agence;

public interface Agencerepository extends JpaRepository<Agence, Long> {
}