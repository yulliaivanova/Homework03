package app.repository;

import app.model.Client;

public interface ClientRepository {
    Client getById(long id);
}
