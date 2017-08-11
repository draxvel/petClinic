package com.company;

import java.util.Vector;

public class Clinic
{
    //clients list
    private final Vector <Client> vecClients = new Vector <Client> ();

    public Clinic (final int size)
    {
        this.vecClients.setSize(size);
    }

    public void addClient (final int position, final Client client)
    {
        vecClients.add(position, client);
    }

    public Client getClient (final int position)
    {
        return vecClients.get(position);
    }
}
