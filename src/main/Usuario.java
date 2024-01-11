package main;

public class Usuario {

    public String username;
    private String password;

    public Usuario() {
        this.username = "";
        this.password = "";
    }

    public Usuario(String username) {
        this.username = username;
        this.password = "";
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

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


    public void establecerRol() {
        Administrador admin = new Administrador();
        admin.trabajar();
    }

    public class Administrador {

        public void trabajar() {
            System.out.println("El administrador " + username + " está trabajando.");
        }

    }

}