package br.ufpi.es2.entity;

public class User {

    private int id;
    private String name;
    private String login;
    private String email;
    private String password;

    public User(int id, String name, String login, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    //GET METHODS

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    // SET METHODS

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
