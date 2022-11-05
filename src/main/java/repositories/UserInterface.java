
package repositories;

import java.util.List;
import models.User;


public interface UserInterface {
    List<User> getAll();
    List<User> seach(String ma);
    boolean save(User user);
    boolean delete(User user);
    User getObj(String ma);
}
