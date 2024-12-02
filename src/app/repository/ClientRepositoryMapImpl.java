package app.repository;

import app.model.Client;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ClientRepositoryMapImpl implements ClientRepository{

    private Map<Long, Client> clients = new HashMap<>();

    public ClientRepositoryMapImpl() {
        creatingClientData();
    }

    private void creatingClientData() {
        clients.put(1L, new Client(1L, "Yuliia", "16.04.1988", "gerda@gmail.com"));
        clients.put(2L, new Client(2L, "Christina", "20.02.1990", "christinaWE@gmail.com"));
        clients.put(3L, new Client(3L, "Christian", "01.03.1999", "Email@gmail.com"));
    }


    @Override
    public Client getById(long id) {
        return clients.get(id);
    }
}
