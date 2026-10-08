package tn.esprit.springbootautoloc.service.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.RESERVATION.Reservation;
import tn.esprit.springbootautoloc.repository.Reservationrepository;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private Reservationrepository reservationrepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationrepository.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationrepository.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationrepository.deleteById(id);
    }

    @Override
    public Reservation recupererReservation(Long id) {
        return reservationrepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> recupererToutesLesReservations() {
        return reservationrepository.findAll();
    }
}