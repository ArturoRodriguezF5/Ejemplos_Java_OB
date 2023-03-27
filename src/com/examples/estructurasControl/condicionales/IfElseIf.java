package com.examples.estructurasControl.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "Viernes";

        if (dia.equals("Lunes")) {
            System.out.println("Hoy es lunes.");
        } else if (dia.equals("Martes")) {
            System.out.println("Hoy es Martes.");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Hoy es Miercoles.");
        } else if (dia.equals("Jueves")) {
            System.out.println("Hoy es jueves.");
        } else if (dia.equals("Viernes")) {
            System.out.println("Hoy es viernes.");
        } else {
            System.out.println("Día que no es de la semana.");
        }
    }
}
