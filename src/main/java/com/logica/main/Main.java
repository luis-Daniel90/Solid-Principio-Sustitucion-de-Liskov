package com.logica.main;

import com.logica.clases.*;

public final class Main {
    public static void main(String[] args) {

    /*
    *EJERCICIO:
    * Explora el "Principio SOLID de Sustitución de Liskov (Liskov Substitution Principle, LSP)"
    * y crea un ejemplo simple donde se muestre su funcionamiento
    * de forma correcta e incorrecta.
    */

    Ave ave1 = new Aguila();
    Ave ave2 = new Pollo();

    ave1.mover();
    ave2.mover();

    System.out.println();
    System.out.println("***************** EXTRA ****************");
    System.out.println();

    /*DIFICULTAD EXTRA (opcional):
    * Crea una jerarquía de vehículos. Todos ellos deben poder acelerar y frenar, así como
    * cumplir el LSP.
    * Instrucciones:
    * 1. Crea la clase Vehículo.
    * 2. Añade tres subclases de Vehículo.
    * 3. Implementa las operaciones "acelerar" y "frenar" como corresponda.
    * 4. Desarrolla un código que compruebe que se cumple el LSP.
    */

    }
}
