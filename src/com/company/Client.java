package com.company;

import pets.Pet;

import java.util.Vector;

public class Client
{
    private int id;
    private String name;

    //pets list
    private Vector <Pet> vecPets = new Vector <Pet>();


    public Client(int id, String name, Pet pet)
    {
        this.id = id;
        this.name = name;
        this.vecPets.add(pet);
    }

    public void addPet (final Pet pet)
    {
        this.vecPets.add(pet);
    }
}
