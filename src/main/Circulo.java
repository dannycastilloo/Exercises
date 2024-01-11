package main;

public class Circulo {

    public static final float pi = 3.1415926535f;
    public float radio = 0f;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public static float area(float radio) {
        return Circulo.pi * (radio * radio);
    }

}
