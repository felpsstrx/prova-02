package model;

public class Usuario {

    private String username;

    public Usuario(String username) {
        this.username = username;
    }

    public boolean validarUsername() {
        return username.length() > 5;
    }
}
