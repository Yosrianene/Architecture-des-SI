package tn.esprit.springbootautoloc.service.Employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.EMPLOYE.Employe;
import tn.esprit.springbootautoloc.repository.Employerepository;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private Employerepository employerepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employerepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employerepository.save(employe);
    }

    @Override
    public void supprimerEmploye(Long id) {
        employerepository.deleteById(id);
    }

    @Override
    public Employe recupererEmploye(Long id) {
        return employerepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> recupererTousLesEmployes() {
        return employerepository.findAll();
    }
}