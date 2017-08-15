package com.draxvel.petClinic.model.pets;

import com.draxvel.petClinic.model.exception.EmptyNameException;

public class Pet
{
    private String name;

    public Pet(String name)
    {
        this.name = name;
    }

    public void makeSound() {}

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyNameException {
        if(!name.isEmpty()) {
            this.name = name;
        }
        else throw new EmptyNameException();
    }

    @Override
    public String toString() {
        return  this.name +" ";
    }
}
