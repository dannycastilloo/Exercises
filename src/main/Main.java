package main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

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
        nombres[0] = "Danny";
        nombres[1] = "Carla";
        nombres[2] = "Valentino";
        */

        /* Definición 2
        String nombres[] = new String[3];
        nombres[0] = "Danny";
        nombres[1] = "Carla";
        nombres[2] = "Valentino";
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
        /*int calificaciones[][] = new int[5][];

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
        }*/

        /*
        Para obtener un número aleatorio en Java podemos hacer uso de la siguiente sentencia.
        int numero = (int)(Math.random() * 100);
        */

        // Ejercicios Arreglos

        // Crear un arreglo cual nos permita almacenar cien números enteros.

        /*int valores[] = new int[100];*/

        // Llenar el arreglo con números aleatorios.

        /*for ( int i = 0; i < valores.length; i++ ) {
            valores[i] = (int)(Math.random() * 101);
        }*/

        // Mostrar en consola el número mayor.

        /*System.out.println(Arrays.stream(valores).max().orElse(0));+/

        // Mostrar en consola el número menor.

        /*System.out.println(Arrays.stream(valores).min().orElse(0));*/

        // Mostrar en consola todos los números primos.

        /*for (int valor : valores) {
            boolean esPrimo = valor > 1;
            for (int i = 2; i <= Math.sqrt(valor) && esPrimo; i++) {
                esPrimo = valor % i != 0;
            }
            if (esPrimo)
                System.out.println(valor);
        }*/

        // Mostrar en consola todos los números pares.

        /*for (int valor : valores) {
            if (valor % 2 == 0) {
                System.out.println(valor);
            }
        }*/

        // Mostrar en consola el arreglo de forma ascendente.

        /* Usando funciones de Java - Collectors
        System.out.print(Arrays.stream(valores).sorted().mapToObj(Integer::toString).collect(Collectors.joining(", ")));*/

        /* Algoritmo de ordenación por inserción
        for (int i = 1; i < valores.length; i++) {
            int clave = valores[i];
            int j = i - 1;

            while (j >= 0 && valores[j] > clave) {
                valores[j + 1] = valores[j];
                j = j - 1;
            }

            valores[j + 1] = clave;
        }

        for (int valor : valores) {
            System.out.print(valor + " ");
        }*/

        // Mostrar en consola el promedio del arreglo.

        /*System.out.println(Arrays.stream(valores).average().orElse(0));*/

        // Mostrar en consola la suma del primer y último elemento del arreglo.

        /*int max = Arrays.stream(valores).max().orElse(0);
        int min = Arrays.stream(valores).min().orElse(0);
        int suma = max + min;
        System.out.println("La suma de " + max + " y " + min + " es: " + suma);*/

        // Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.

        /*for (int valor : valores) {
            if (valor == 100)
                System.out.println("Existe cien");
        }*/

        // Ejercicios Matriz

        // Crear un matriz de 5 x 5

        int matriz[][] = new int[5][5];

        // Llenar la matriz con números aleatorios.

        for (int posX = 0; posX < matriz.length; posX++) {
            for (int posY = 0; posY < matriz[posX].length; posY++) {
                matriz[posX][posY] = (int) (Math.random() * 100) + 1;
            }
        }

        // Mostrar en consola el promedio de la matriz.

        /*int suma = 0;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }

        double promedio = (double) suma / matriz.length;

        System.out.println("El promedio de los elementos es: " + promedio);*/

        // Mostrar en consola el número mayor y la cantidad de veces que este se repite.

        /*int mayor = Integer.MIN_VALUE;
        int frecuenciaMayor = 0;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento > mayor) {
                    mayor = elemento;
                    frecuenciaMayor = 1;
                } else if (elemento == mayor) {
                    frecuenciaMayor++;
                }
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("La cantidad de veces que se repite es: " + frecuenciaMayor);*/

        // Mostrar en consola todos los números primos.

        /*for (int fila[] : matriz) {
            for (int elemento : fila) {
                boolean esPrimo = elemento > 1;
                for (int i = 2; i <= Math.sqrt(elemento) && esPrimo; i++) {
                    esPrimo = elemento % i != 0;
                }
                if (esPrimo)
                    System.out.println(elemento);
            }
        }*/

        // Mostrar en consola todos los números pares.

        /*for (int fila[] : matriz) {
            for (int elemento : fila) {
                if(elemento % 2 == 0) {
                    System.out.println(elemento);
                }
            }
        }*/

        // Mostrar en consola la suma de las diagonales

        /*int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }

        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }

        int sumDiagonales = sumaDiagonalPrincipal + sumaDiagonalSecundaria;

        System.out.println("La suma de las diagonales es: " + sumDiagonales);*/

        // Mostrar en consola la suma de la última fila.

        /*int ultimaFila = matriz.length - 1;

        int sumaUltimaFila = 0;
        for (int elemento : matriz[ultimaFila]) {
            sumaUltimaFila += elemento;
        }

        System.out.println("La suma de la última fila es: " + sumaUltimaFila);*/

        // Mostrar en consola el mensaje "Cuadrado Mágico" si la matriz cataloga como un cuadrado mágico.

        /*boolean esCuadradoMagico = true;

        int sumaFila = 0;
        for (int elemento : matriz[0]) {
            sumaFila += elemento;
        }

        boolean isFila = true;
        for (int i = 1; i < matriz.length; i++) {
            int sumaActual = 0;
            for (int elemento : matriz[i]) {
                sumaActual += elemento;
            }
            if (sumaActual != sumaFila) {
                isFila = false;
                break;
            }
        }

        boolean isColumna = true;
        int sumaColumna = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaFila) {
                isColumna = false;
                break;
            }
        }

        boolean isDiagonalPrincipal = true;
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        if (sumaDiagonalPrincipal != sumaFila) {
            isDiagonalPrincipal = false;
        }

        boolean isDiagonalSecundaria = true;
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        if (sumaDiagonalSecundaria != sumaFila) {
            isDiagonalSecundaria = false;
        }

        esCuadradoMagico = isFila && isColumna && isDiagonalPrincipal && isDiagonalSecundaria;

        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println(sumaFila);
        System.out.println(sumaColumna);
        System.out.println(sumaDiagonalPrincipal);
        System.out.println(sumaDiagonalSecundaria);

        if (esCuadradoMagico) {
            System.out.println("Cuadrado Mágico");
        } else {
            System.out.println("No es un Cuadrado Mágico");
        }*/

        /*Perro valentino = new Perro();

        valentino.nombre = "Valentino";
        valentino.raza = "Cocker";
        valentino.edad = 10;

        System.out.println("El nombre es: " + valentino.nombre);
        System.out.println("La raza es: " + valentino.raza);
        System.out.println("La edad es: " + valentino.edad);

        valentino.comer();
        valentino.ladrar();
        valentino.dormir();

        System.out.println();

        Perro huesito = new Perro();
        huesito.establecerAtributos("Huesito", 9, "Mestizo");
        System.out.println("El nombre es: " + huesito.nombre);
        System.out.println("La raza es: " + huesito.raza);
        System.out.println("La edad es: " + huesito.edad);*/

        /*Triangulo triangulo = new Triangulo();
        triangulo.base = 5;
        triangulo.altura = 8;
        float resultado = triangulo.area();
        System.out.println("El área del triángulo es: " + resultado);*/

        /*Usuario codi = new Usuario();
        codi.username = "Codi";
        codi.setPassword("Pass");

        System.out.println(codi.username);
        System.out.println(codi.getPassword());

        codi.saludar();*/

        /*Calculadora calculadora = new Calculadora();
        int suma1 = calculadora.sumar(4,6);
        float suma2 = calculadora.sumar(4.4f, 6.8f);
        double suma3 = calculadora.sumar(4,6);
        double suma4 = calculadora.sumar(4,6,8);
        System.out.println("El resultado de la suma 1 es: " + suma1);
        System.out.println("El resultado de la suma 2 es: " + suma2);
        System.out.println("El resultado de la suma 3 es: " + suma3);
        System.out.println("El resultado de la suma 4 es: " + suma4);*/

        /*Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Usuario2");
        Usuario usuario3 = new Usuario("Usuario3", "Password");

        usuario1.saludar();
        usuario2.saludar();
        usuario3.saludar();*/

        /*Calculadora calculadora = new Calculadora();

        int resultadoInt = calculadora.sumar(10,4);
        float resultadoFloat = calculadora.sumar(10.4f,4.8f);
        double resultadoDouble = calculadora.sumar(10.5,4.2);
        System.out.println("Resultado 1: " + resultadoInt);
        System.out.println("Resultado 2: " + resultadoFloat);
        System.out.println("Resultado 3: " + resultadoDouble);*/

        // System.out.println(Circulo.area(123f));

        /*Usuario usuario = new Usuario("Codi");
        usuario.establecerRol();*/

        Gato gato = new Gato();
        Perro perro = new Perro("perro", "raza", 4);

        perro.dormir();
        gato.dormir();
    }
}