package customer;

import app.controller.ClientController;
import app.model.Client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("app");
        ClientController controller = context.getBean(ClientController.class);
        Client client =controller.getById(2);
        System.out.println(client);
    }
}
