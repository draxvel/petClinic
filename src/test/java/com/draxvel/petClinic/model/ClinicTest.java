package com.draxvel.petClinic.model;

import com.draxvel.petClinic.model.pets.Pet;
import com.draxvel.petClinic.view.ConsoleView;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicTest {

    @Test
    public void addClient() throws Exception {
        Clinic clinic = new Clinic();
        Client Nazar = new Client(0, "Nazar", new Pet("Muhtar"));
        clinic.addClient(Nazar);
        assertEquals(Nazar, clinic.getClient(0));
    }

    @Test
    public void deleteClient() throws Exception {
        Clinic clinic = new Clinic();
        Client Nazar = new Client(0, "Nazar", new Pet("Muhtar"));
        clinic.addClient(Nazar);
        clinic.deleteClient(Nazar);
        assertEquals(0, clinic.getVecClients().size());
    }

    @Test
    public void getClient() throws Exception {
        Clinic clinic = new Clinic();
        Client Nazar = new Client(0, "Nazar", new Pet("Muhtar"));
        clinic.addClient(Nazar);
        assertEquals(Nazar, clinic.getClient(0));
    }

    @Test
    public void getVecClients() throws Exception {
        Clinic clinic = new Clinic();
        Client Nazar = new Client(0, "Nazar", new Pet("Muhtar"));
        clinic.addClient(Nazar);
        assertNotNull(clinic.getVecClients());
    }

    @Test
    public void searchByClientName() throws Exception {
        Clinic clinic = new Clinic();
        Client Nazar = new Client(0, "Nazar", new Pet("Muhtar"));
        Client Paul = new Client(1, "Paul", new Pet("Bob"));
        Client Mark = new Client(2, "Mark", new Pet("Lev"));
        clinic.addClient(Nazar);
        clinic.addClient(Paul);
        clinic.addClient(Mark);

        assertEquals(Paul, clinic.searchByClientName("Paul"));
    }

    @Test
    public void searchByPetName() throws Exception {

        Clinic clinic = new Clinic();

        Client Nazar = new Client(0, "Nazar", new Pet("Muhtar"));
        Client Paul = new Client(1, "Paul", new Pet("Bob"));
        Client Mark = new Client(2, "Mark", new Pet("Lev"));
        Paul.addPet(new Pet("Kil"));
        Mark.addPet(new Pet("Ololo"));

        clinic.addClient(Nazar);
        clinic.addClient(Paul);
        clinic.addClient(Mark);

        assertEquals(Mark, clinic.searchByPetName("Ololo"));
    }

}