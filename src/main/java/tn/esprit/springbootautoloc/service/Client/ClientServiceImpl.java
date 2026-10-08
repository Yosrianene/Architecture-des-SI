package tn.esprit.springbootautoloc.service.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.CLIENT.Client;
import tn.esprit.springbootautoloc.repository.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client recupererClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> recupererTousLesClients() {
        return clientRepository.findAll();
    }
}