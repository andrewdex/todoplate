package angular.service;

import angular.domain.User;

/**
 * Created by Dilusha on 3/1/2015.
 */

/*User Web Service*/
public class UserService {


    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("JonFromREST");
        user.setLastName("DoeFromREST");
        return user;
    }


}
