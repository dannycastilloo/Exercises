package main;

public class Perro {

    String nombre;
    int edad;
    String raza;

    // Parámetros
    void establecerAtributos(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    void comer() {
        System.out.println("El perro se encuentra comiendo.");
    }

    void ladrar() {
        System.out.println("El perro se encuentra ladrando.");
    }

    void dormir() {
        System.out.println("El perro se encuentra durmiendo.");
    }

}
