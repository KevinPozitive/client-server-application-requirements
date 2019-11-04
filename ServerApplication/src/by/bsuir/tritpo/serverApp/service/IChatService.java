package by.bsuir.tritpo.serverApp.service;

import by.bsuir.tritpo.serverApp.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IChatService {
    boolean addNewUser(User user) throws SQLException;
    boolean checkUser(String name, String password) throws SQLException;
    boolean isLoginReserved(String name) throws SQLException;
    ArrayList<User> getUsers();
    ArrayList<String> getMessages();
    String getLastMsg();
}
