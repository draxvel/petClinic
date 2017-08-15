package com.draxvel.petClinic.model.pets;

public class Cat extends Pet
{
    public Cat (final String name)
    {
        super(name);
    }

    @Override
    public void makeSound()
    {
        System.out.println("mayyy");
    }
}
