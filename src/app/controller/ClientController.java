package app.controller;

import app.model.Client;
import app.service.ClientService;
import org.springframework.stereotype.Component;

@Component
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }
    public Client getById(long id){
        return service.getById(id);
    }
}
