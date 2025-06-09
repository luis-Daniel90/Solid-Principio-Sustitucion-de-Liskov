package com.logica.clasesExtra;

public class Moto extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("La moto acelera con el puno acelerador");
    }

    @Override
    public void frenar() {
        System.out.println("La moto frena con la manilla");
    }

}
