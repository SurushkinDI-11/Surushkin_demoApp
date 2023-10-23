package Users;

import java.util.ArrayList;
import java.util.List;


public class DataUsers {
   public  List<User> data = new ArrayList<>();
    {

        User admin = new User("Владимир", "333");
        User user = new User("Валера", "332");
        data.add(admin);
        data.add(user);
    }

}
