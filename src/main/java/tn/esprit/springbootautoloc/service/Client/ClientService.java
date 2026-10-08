package tn.esprit.springbootautoloc.service.Client;

import tn.esprit.springbootautoloc.models.CLIENT.Client;

import java.util.List;

public interface ClientService {

    Client ajouterClient(Client client);

    Client modifierClient(Client client);

    void supprimerClient(Long id);

    Client recupererClient(Long id);

    List<Client> recupererTousLesClients();
}