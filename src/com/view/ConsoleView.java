package com.view;

import com.model.Client;
import com.model.Clinic;
import com.model.pets.Cat;
import com.model.pets.Dog;

public class ConsoleView
{

    private Clinic clinic = new Clinic();

    public void addClients()
    {
        Client c1 = new Client(0, "Mark", new Dog("Barsik"));
        Client c2 = new Client(1,"Bogdan", new Cat("Murka"));

        clinic.addClient(c1);
        clinic.addClient(c2);

      clinic.getClient(0).addPet(new Dog("Muhtar"));
      clinic.getClient(1).addPet(new Dog("Chapy"));
    }

    public void show()
    {
        System.out.println("size = "+clinic.getVecClients().size());
        for(int i = 0; i<clinic.getVecClients().size(); i++)
        {
            System.out.print("Client: ");
            System.out.println(clinic.getClient(i).getName());
            System.out.println("Pets: ");
            System.out.println(clinic.getClient(i).getVecPets().toString());
            System.out.println("--------");
        }
    }

}
