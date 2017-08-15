package com.model;

import java.util.Vector;

public class Clinic
{
    //clients list
    private final Vector <Client> vecClients = new Vector <Client> ();

//    public Clinic (final int size)
//    {
//        this.vecClients.setSize(size);
//    }

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
}
