package br.ufpi.es2.data;

import java.util.ArrayList;
import br.ufpi.es2.entity.User;

public interface InterfaceUsersRepository {
    public void addUser(User u);
    public ArrayList<User> listUsers();
    public User searchUser(String login, String password);
    public boolean changeUser(User original, User newUser);
    public boolean removeUser(User u);
}
