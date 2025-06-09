package com.logica.clasesExtra;

public class Bicicleta extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("La bicicleta acelera con el pedaleo");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta frena con las manillas de freno");
    }

}
