package com.draxvel.petClinic.model;

import com.draxvel.petClinic.model.pets.Pet;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void setName() throws Exception {
        Client Paul = new Client(0, "Paul", new Pet("Murka"));
        Paul.setName("Marko");
        assertEquals("Marko", Paul.getName());
    }

    @Test
    public void getName() throws Exception {
        Client Paul = new Client(0, "Paul", new Pet("Murka"));
        assertEquals("Paul", Paul.getName());
    }

    @Test
    public void getId() throws Exception {
        Client Paul = new Client(0, "Paul", new Pet("Murka"));
        assertEquals(0, Paul.getId());
    }

    @Test
    public void addPet() throws Exception {
        Client Paul = new Client(0, "Paul", new Pet("Murka"));
        Pet Kraken = new Pet("Kraken");
        Paul.addPet(Kraken);
        assertEquals(Kraken, Paul.getPet(1));
    }

    @Test
    public void getPet() throws Exception {
        Client Paul = new Client(0, "Paul", new Pet("Murka"));
        Pet Kraken = new Pet("Kraken");
        Paul.addPet(Kraken);
        assertEquals(Kraken, Paul.getPet(1));
    }

    @Test
    public void deletePet() throws Exception {
        Pet Kraken = new Pet("Kraken");
        Client Paul = new Client(0, "Paul", Kraken);
        Paul.deletePet(Kraken);
        assertEquals(0, Paul.getVecPets().size());
    }

    @Test
    public void getVecPets() throws Exception {
        Pet pet1 = new Pet("pet1");
        Pet pet2 = new Pet("pet2");

        Client cl1 = new Client(0, "cl1", pet1);
        cl1.addPet(pet2);

        assertNotNull(cl1.getVecPets());
    }

}