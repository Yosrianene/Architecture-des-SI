package tn.esprit.springbootautoloc.service.Reservation;

import tn.esprit.springbootautoloc.models.RESERVATION.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation ajouterReservation(Reservation reservation);

    Reservation modifierReservation(Reservation reservation);

    void supprimerReservation(Long id);

    Reservation recupererReservation(Long id);

    List<Reservation> recupererToutesLesReservations();
}