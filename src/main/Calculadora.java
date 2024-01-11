package main;

public class Calculadora {

    public int sumar(int... numeros) { // n -> int Arreglo
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public float sumar(float... numeros) { // n -> int Arreglo
        float suma = 0.0f;
        for (float numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public double sumar(double... numeros) { // n -> int Arreglo
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }

}