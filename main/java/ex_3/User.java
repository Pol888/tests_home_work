package ex_3;

import java.util.Objects;

public class User {

    private final String login;
    private final String password;
    private boolean isAdmin = false;




    public User(String login, String password) {
        this.login = login;
        this.password = password;

    }

    public User(String login, String password, boolean isAdmin) {
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean authentication(String login, String password) {
        return Objects.equals(login, this.login) && Objects.equals(password, this.password);
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }


}
