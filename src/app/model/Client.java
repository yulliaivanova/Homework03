package app.model;

import java.util.Date;
import java.util.Objects;

public class Client {
    private long id;
    private String name;
    private String dateOfBirthday;
    private String email;

    public Client(long id, String name, String date, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = date;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return dateOfBirthday;
    }

    public void setDate(Date date) {
        this.dateOfBirthday = String.valueOf(date);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(dateOfBirthday, client.dateOfBirthday) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirthday, email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", email='" + email + '\'' +
                '}';
    }
}
