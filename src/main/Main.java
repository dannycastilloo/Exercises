package main;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        // Even numbers up to 10
        /*for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }*/

        // Break
        /*int valor = 10;
        switch (valor) {
            case 10:
                System.out.println("Es 10");
                break;
            default:
                System.out.println("No es 10");
        }*/

        /*for (int x = 1; x < 101; x++) {
            if (x == 5) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("Ciclo completo.");*/

        /*for (int i = 0; i < 3; i++) {
            System.out.print("Siguiente " + i + ": ");

            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Ciclo completado.");*/

        // Continue
        /*for (int x = 0; x < 10; x++) {
            if (x == 5) {
                continue;
            }
            System.out.println(x);
        }*/

        // Única Sentencia
        /*boolean valor2 = true;

        if (valor2)
            System.out.println("Es verdadero.");
        else
            System.out.println("Es falso.");

        for (int x = 0; x < 10; x++)
            System.out.println("Mensaje");*/

        // Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje "Reprobado".
        /*int calificacion = 70;
        if (calificacion >= 70)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobado");*/

        // Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
        /*int x1 = 5, x2 = 1, x3 = 10;
        if (x1 > x2) {
            int temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (x2 > x3) {
            int temp = x2;
            x2 = x3;
            x3 = temp;

            if (x1 > x2) {
                int temp2 = x1;
                x1 = x2;
                x2 = temp2;
            }
        }
        System.out.println("Números: " + x1 + " " + x2 + " " + x3);*/

        // Imprimir en consola la tabla de multiplicar del número 9.
        /*int counter = 9;
        for (int x = 1; x <= 10; x++) {
            System.out.println(9*x);
        }*/

        // Replicar la siguiente salida en consola.
        /*
         *
         **
         ***
         ****
         *****
         ******
         */
        /*int altura = 6;
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        // Replicar la siguiente salida en consola.
        /*
             *
            ***
           *****
          *******
         *********
         */
        /*int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }*/

        // Imprimir en consola los primeros diez números de la serie Fibonacci.
        /*int fibonacci = 1;
        int anterior = 1;
        for (int n = 1; n <= 10; n++) {
            int temp = fibonacci;
            fibonacci += anterior;
            anterior = temp;
            System.out.println(fibonacci);
        }*/

        // Dado un número saber si este es primo o no.
        /*int esPrimo = 8;
        if (esPrimo % 2 != 0)
            System.out.println("Es primo.");
        else
            System.out.println("No es primo.");*/

        // Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570.
        /*int multiplo = 2;
        while (multiplo < 4570) {
            System.out.println(multiplo);
            multiplo += 2;
        }*/

        // Dado un número entero obtener su factorial.
        /*int factorial = 5;
        int resultado = 1;
        for (int temp = factorial; temp >= 1; temp--) {
            resultado = temp * resultado;
        }
        System.out.println("Factorial de " + factorial + ": " + resultado);*/

        // Arreglos
        /* Definición 1
        String nombres[];
        nombres = new String[3];
        nombres[0] = "Danny"; nombres[1] = "Carla"; nombres[2] = "Valentino";
        */

        /* Definición 2
        String nombres[] = new String[3];
        nombres[0] = "Danny"; nombres[1] = "Carla"; nombres[2] = "Valentino";
        */

        /* Definición 3
        String nombres[] = {"Danny", "Carla", "Valentino"};
        */

        /* Output
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        */

        /*
        int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        for (int indice = 0; indice < calificaciones.length; indice++) {
            suma += calificaciones[indice];
        }
        float promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);
        */

        /* String como cadena Java
        String mensaje = "Este mensaje posee muchas letras a";
        int indicePrimeraA = mensaje.indexOf("a");
        int indiceSegundaA = mensaje.indexOf("a", indicePrimeraA + 1 );
        System.out.println(indicePrimeraA);
        System.out.println(indiceSegundaA);
        */

        /*String mensaje = "Hola Mundo";
        int indiceLetraM = mensaje.indexOf("M");
        String subString = mensaje.substring(indiceLetraM);
        System.out.println(subString);*/

        /*String mensaje = "Hola Mundo";
        int indiceLetraM = mensaje.indexOf("M");
        String subString = mensaje.substring(indiceLetraM, indiceLetraM + 2);
        System.out.println(subString);*/

        // For each
        /*
        int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);
        */

        /*
        int valores[] = new int[10];

        for (int indice = 0; indice < valores.length; indice++) {
            valores[indice] = indice;
        }

        for (int valor: valores) {
            System.out.println(valor);
        }
        */

        // Matrices
        /*
        int matriz[][] = new int[4][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 1;
        matriz[1][1] = 2;
        matriz[1][2] = 3;

        matriz[2][0] = 1;
        matriz[2][1] = 2;
        matriz[2][2] = 3;

        for (int posX = 0; posX < matriz.length; posX++) {
            for (int posY = 0; posY < matriz[posX].length; posY++) {
                matriz[posX][posY] = posY + 1;
            }
        }

        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.println(celda);
            }
        }
        */

        // Arreglos dinámicos
        int calificaciones[][] = new int[5][];

        calificaciones[0] = new int[1]; // E
        calificaciones[1] = new int[2]; // A
        calificaciones[2] = new int[3]; // D
        calificaciones[3] = new int[4]; // B
        calificaciones[4] = new int[5]; // C

        calificaciones[0][0] = 8;

        calificaciones[1][0] = 9;
        calificaciones[1][1] = 10;

        calificaciones[2][0] = 8;
        calificaciones[2][1] = 9;
        calificaciones[2][2] = 10;

        calificaciones[3][0] = 8;
        calificaciones[3][1] = 9;
        calificaciones[3][2] = 10;

        calificaciones[4][0] = 8;
        calificaciones[4][1] = 9;
        calificaciones[4][2] = 10;
        calificaciones[4][3] = 10;

        for (int []calificacionesPorAlumno : calificaciones) {
            for (int calificacion : calificacionesPorAlumno) {
                System.out.print(calificacion + " ");
            }
            System.out.println("");
        }

    }
}