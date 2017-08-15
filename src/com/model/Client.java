package com.model;

import com.model.exception.EmptyNameException;
import com.model.pets.Pet;

import java.util.Vector;

public class Client
{
    private int id;
    private String name;

    private Vector <Pet> vecPets = new Vector <Pet>();

    public Client(int id, String name, Pet pet)
    {
        this.id = id;
        this.name = name;
        this.vecPets.add(pet);
    }

    public void setName(String name) throws EmptyNameException {
        if (!name.isEmpty()) {
            this.name = name;
        } else throw new EmptyNameException();
    }

    public String getName() {
        return name;
    }

    public void addPet (final Pet pet)
    {
        this.vecPets.add(pet);
    }

    public Pet getPet (final int index)
    {
        return this.vecPets.get(index);
    }

    public void deletePet (final Pet pet)
    {
        this.vecPets.remove(pet);
    }

    public Vector<Pet> getVecPets() {
        return vecPets;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
