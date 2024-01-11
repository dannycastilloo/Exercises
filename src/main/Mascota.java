package main;

public class Mascota {

    public String nombre;
    public int edad;
    public String raza;

    public Mascota() {

    }

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    void establecerAtributos(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    void comer() {
        System.out.println("El " + nombre + " se encuentra comiendo.");
    }

    void ladrar() {
        System.out.println("El " + nombre + "se encuentra ladrando.");
    }

    void dormir() {
        System.out.println("La mascota se encuentra durmiendo.");
    }

}
