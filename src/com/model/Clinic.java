package com.model;

import java.util.Objects;
import java.util.Vector;

public class Clinic
{
    //clients list
    private final Vector <Client> vecClients = new Vector <Client> ();

    public void addClient (final Client client)
    {
        vecClients.add(client);
    }

    public void deleteClient (final Client client)
    {
        vecClients.remove(client);
    }

    public Client getClient (final int id)
    {
        return vecClients.get(id);
    }

    public Vector<Client> getVecClients()
    {
        return vecClients;
    }

    public Client searchByClientName (final String name)
    {
        for (Client e:
             vecClients)
        {
            if (Objects.equals(e.getName(), name)) return e;
        }
        return null;
    }

    public Client searchByPetName (final String petName)
    {
        for(Client e:
                vecClients)
        {
            for(int i =0; i<e.getVecPets().size(); i++)
            {
                if(e.getPet(i).getName() == petName)
                    return e;
            }
        }
        return null;
    }}
