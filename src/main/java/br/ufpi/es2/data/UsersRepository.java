package br.ufpi.es2.data;

import java.util.ArrayList;
import br.ufpi.es2.entity.User;

public class UsersRepository implements InterfaceUsersRepository {

    private ArrayList<User> listOfUsers = new ArrayList<User>();

    public void addUser(User u) {
        this.listOfUsers.add(u);
    }

    public ArrayList<User> listUsers() {
        return this.listOfUsers;
    }

    public User searchUser(String login, String password) {
        for (int i = 0; i < this.listOfUsers.size(); i++)
            if (this.listOfUsers.get(i).getLogin().equals(login) && this.listOfUsers.get(i).getPassword().equals(password))
                return this.listOfUsers.get(i);

        return null;
    }

    public boolean changeUser(User original, User newUser) {
        return false; //TODO
    }

    public boolean removeUser(User u) {
        return false; //TODO
    }

    public void autoPopulate()
    {
        User u1 = new User(1, "Armando Soares Souza", "armando",
                "armando@ufpi.edu.br", "armando");

        User u2 = new User(2, "Luca Carvalho de Oliveira", "luca",
                "luca@ufpi.edu.br", "luca");

        User u3 = new User(3, "Maria da Silva", "maria",
                "maria@ufpi.edu.br", "maria");

        User u4 = new User(4, "Jose Da Silva", "jose",
                "jose@ufpi.edu.br", "jose");

        User u5 = new User(5, "Pedro Pinto", "pedro",
                "pedro@ufpi.edu.br", "pedro");


        this.listOfUsers.add(u1);
        this.listOfUsers.add(u2);
        this.listOfUsers.add(u3);
        this.listOfUsers.add(u4);
        this.listOfUsers.add(u5);

    }
}
