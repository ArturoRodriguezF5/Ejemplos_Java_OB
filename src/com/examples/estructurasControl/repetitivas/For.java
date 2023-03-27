package com.examples.estructurasControl.repetitivas;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola.");
        }

        String[] frutas = {"Sandia", "Melón", "Platano"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        int suma = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        System.out.println("La suma de todos los números de array es: " + suma);
    }
}
