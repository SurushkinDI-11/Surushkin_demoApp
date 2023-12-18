package Users;

import java.util.ArrayList;
import java.util.List;


public class DataUsers {
   public static List<User> data = new ArrayList<>();
    {

        User admin = new User("admin", "1111");
        User user = new User("user", "2222");
        data.add(admin);
        data.add(user);
    }
    public static void addUser(String login, String pass){
        User user = new User(login, pass);
        data.add(user);
    }

}
