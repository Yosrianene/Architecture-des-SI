package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.CLIENT.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}