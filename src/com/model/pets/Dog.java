package com.model.pets;

public class Dog extends Pet
{
    public Dog (final String name)
    {
        super(name);
    }

    @Override
    public void makeSound()
    {
        System.out.println("gav");
    }
}
