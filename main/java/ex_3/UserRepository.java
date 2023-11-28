package ex_3;

import java.util.ArrayList;


public class UserRepository {
    private ArrayList<User> usersInTheSystem = new ArrayList<>();

    public ArrayList<User> getUsersInTheSystem() {
        return usersInTheSystem;
    }

    void addUser(User user, String login, String password){

        if (user.authentication(login, password)){
            usersInTheSystem.add(user);
        }
    }

    void loginsOutAllUsers(){
        ArrayList<User> resUsersInTheSystem = new ArrayList<>();
        for (int i = 0; i < usersInTheSystem.size(); i++) {
            if(usersInTheSystem.get(i).isAdmin()){
                resUsersInTheSystem.add(usersInTheSystem.get(i));
            }
        }
        this.usersInTheSystem = resUsersInTheSystem;
    }
}
