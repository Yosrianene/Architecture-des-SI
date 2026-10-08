package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.EMPLOYE.Employe;

public interface Employerepository extends JpaRepository<Employe, Long> {
}