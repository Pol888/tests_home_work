package ex_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    String [] logins;
    String [] passwords;
    UserRepository userRepository;

    @BeforeEach
    void setUp(){
        this.logins = new String[]{"userOne", "userTwo"};
        this.passwords = new String[] {"123", "321"};
        this.userRepository = new UserRepository();
    }

    @Test
    void testAuthenticationTrue(){
        User user = new User(logins[0], passwords[0]);

        boolean result = user.authentication(logins[0], passwords[0]);

        assertTrue(result);
    }

    @Test
    void testAuthenticationFalse(){
        User user = new User(logins[0], passwords[0]);

        boolean result = user.authentication(logins[1], passwords[1]);

        assertFalse(result);
    }
    @Test
    void testLogin(){
        User userOne = new User(logins[0], passwords[0]);
        User userTwo = new User(logins[1], passwords[1]);
        User userThree = new User(logins[0], passwords[1]);
        User userFour = new User(logins[1], passwords[0]);

        userRepository.addUser(userOne, logins[0], passwords[0]);
        userRepository.addUser(userTwo, logins[1], passwords[1]);
        userRepository.addUser(userThree, logins[1], passwords[0]);
        userRepository.addUser(userFour, logins[0], passwords[1]);

        assertEquals(userRepository.getUsersInTheSystem().size(), 2);
    }


    @Test
    void testLoginOut(){
        User userOne = new User(logins[0], passwords[0], true);
        User userTwo = new User(logins[1], passwords[1], true);
        User userThree = new User(logins[0], passwords[1]);
        User userFour = new User(logins[1], passwords[0]);

        userRepository.addUser(userOne, logins[0], passwords[0]);
        userRepository.addUser(userTwo, logins[1], passwords[1]);
        userRepository.addUser(userThree, logins[0], passwords[1]);
        userRepository.addUser(userFour, logins[1], passwords[0]);
        userRepository.loginsOutAllUsers();

        System.out.println(userRepository.getUsersInTheSystem());

        assertEquals(userRepository.getUsersInTheSystem().size(), 2);
    }

}
