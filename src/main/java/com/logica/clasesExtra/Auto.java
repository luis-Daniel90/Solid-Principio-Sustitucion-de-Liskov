package com.logica.clasesExtra;

public class Auto extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("El auto acelera con el pedal");
    }

    @Override
    public void frenar() {
        System.out.println("El auto frena con el pedal");
    }
}
