package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springbootautoloc.models.RESERVATION.Reservation;

public interface Reservationrepository extends JpaRepository<Reservation, Long> {
}