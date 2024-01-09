package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //pedir informacion personal
        //que reciba la fecha de nacimiento, año, mes, dia
        //calcular la edad de esa persona
        //SI la persona es mayor de edad se le permite comprar la entrada y de inmediato se le muestra la carta de licores, con sus precios
        //SI NO entonces mostrar un mensaje mandandolo para la casa

        //ENTRADAS
        Scanner leerDato= new Scanner(System.in);
        String nombreCliente;
        String PaisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        //Pedimos los datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombreCliente=leerDato.nextLine();

        System.out.print("Ingrese su pais de origen: ");
        PaisCliente=leerDato.nextLine();

        System.out.print("Ingrese su año de nacimiento: ");
        anoNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        mesNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese su dia de nacimiento: ");
        diaNacimientoCliente=leerDato.nextInt();


        // PROCESANDO LAS ENTRADAS

        //1. como calcular la edad del cliente
        //restar el año actual menos el año de nacimiento
        int edadCliente=2024-anoNacimientoCliente;
        System.out.println("Su edad es: "+edadCliente);

        //2. Decidir con base en la edad si el cliente es mayor de edad

        if (edadCliente>=18){
            System.out.println("Usted es mayor de edad");
            //menu de licores
            //botella de guaro--150
            //botella de don julio--600
            //botella de blue label--1500
            //botella de jagger-200
            System.out.println("MENU");
            System.out.println("1... Botella Aguardiente Antioqueño ----- $150 COP");
            System.out.println("2... Botella de Don Julio --------------- $600 COP");
            System.out.println("3... Botella de Blue Label--------------- $1500 COP");
            System.out.println("4... Botella de Jagger ------------------ $200 COP");


        }else {
            System.out.println("Usted es menor de edad, vaya a dormir");

        }

    }
}