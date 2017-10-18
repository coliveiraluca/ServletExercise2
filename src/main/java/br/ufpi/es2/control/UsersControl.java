package br.ufpi.es2.control;

import br.ufpi.es2.data.InterfaceUsersRepository;
import br.ufpi.es2.entity.User;

import java.util.ArrayList;

public class UsersControl {
    InterfaceUsersRepository repository;

    public UsersControl(InterfaceUsersRepository type){
        this.repository = type;
    }

    public ArrayList<User> getUsuarios()
    {
        return repository.listUsers();
    }

    public User search(String login, String senha)
    {
        return repository.searchUser(login, senha);
    }

    public void insert(User u)
    {
        this.repository.addUser(u);
    }
}
