package br.cesul.app;


import br.cesul.body.Contact;
import br.cesul.body.ContactBook;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Gabriel", "Rua Gabriel Biankati", "M","3523-3711", "935051856", "gabriel@gmail.com");
        ContactBook contactBook = new ContactBook();
        Contact contact2 = new Contact("Iraci", "Rua Cango", "F","3524-1558", "99958-6457", "iraci@gmail.com");
        Contact contact3 = new Contact("João", "Rua Centro", "F","3571-8756", "98404-1856", "joengo@gmail.com");

        contactBook.addContact(contact);
        contactBook.addContact(contact2);
        contactBook.addContact(contact3);

        contactBook.showContacts();

        System.out.println("Contato: João removido...\n ");
        System.out.println("Lista de contatos após remoção:\n");

        contactBook.deleteContact("João");

        contactBook.showContacts();



    }
}
