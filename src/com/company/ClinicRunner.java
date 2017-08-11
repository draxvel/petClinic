package com.company;

import pets.Cat;
import pets.Dog;
import pets.Pet;

public class ClinicRunner
{
    public static void main(String[] args)
    {
        final Clinic clinic = new Clinic(10);

       clinic.addClient(0,new Client(0, "Mark", new Dog("Barsik")));

       clinic.addClient(1, new Client(1,"Bogdan", new Cat("Murka")));

       clinic.getClient(0).addPet(new Pet("Muhtar"));
    }
}
