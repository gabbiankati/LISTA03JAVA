package br.cesul.body;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

    List<Contact> test = new ArrayList<>();

    public void addContact(Contact contact) {
        test.add(contact);
    }

    public void showContacts() {
        for (Contact contact : test) {
            System.out.println("Nome: " + contact.getName());
            System.out.println("Endereço: " + contact.getEndereco());
            System.out.println("Sexo: " + contact.getSexo());
            System.out.println("Telefone: " + contact.getTel());
            System.out.println("Celular: " + contact.getCel());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("                             ");
        }
    }

    public boolean deleteContact(String name) {
        return test.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }
}
