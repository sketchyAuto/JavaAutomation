package Basics1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    User user = new User();
    @Test
    public void canConstructANewUser(){
        User user = new User();
    }
    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected","username",user.getUsername());
        assertEquals("default password expected","Password",user.getPassword());
    }
    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin","pa55worD");
        assertEquals("Given username expected","admin",user.getUsername());
        System.out.println("Username given is: " + user.getUsername());
        assertEquals("Given password expected","pa55worD",user.getPassword());
        System.out.println("Username given is: " + user.getPassword());
    }
    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZword1");
        assertEquals("Setter password expected","PaZZword1",user.getPassword());
        System.out.println("Password was: "+ user.getPassword());
    }

}
