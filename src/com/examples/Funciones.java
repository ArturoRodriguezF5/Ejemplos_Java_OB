package com.examples;

public class Funciones {
    public static void main(String[] args) {

        System.out.println("Hola mundo");

        // Funciones sin parametros y sin tipo de retorno
        holaMundo();
        // Funciones con tipode retorno y sin parametros.
        String info = sinPara();
        System.out.println(info);
        // Funciones con parametros y sin tipo de retorno
        suma(5, 10);
        // Funciones con tipo de retorno y con parametros.
        System.out.println(complet("Arturo ", "Rodríguez"));

    }
    static void holaMundo() {
        System.out.println("Hola Mundo: ");
    }

    static String sinPara() {
        return "sin parámetros";
    }

    static void suma(int x, int y) {
        System.out.println(x + y);
    }

    static String complet(String pal1, String pal2) {
        return pal1 + pal2 + " Flores";
    }
}
