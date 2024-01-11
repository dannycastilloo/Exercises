package main;

public class Usuario {

    public String username;
    private String password;

    // Default
    // Public
    // Private
    // Protected

    public void saludar() {
        System.out.println("Hola, mi username es " + this.username);
    }

    // Getter
    public String getPassword() {
        return this.password;
    }

    // Setter
    public void setPassword(String password) {
        this.password = password;
    }

}