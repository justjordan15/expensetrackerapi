package in.jordane.expensetrackerapi.service;

import in.jordane.expensetrackerapi.entity.User;
import in.jordane.expensetrackerapi.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);
}
