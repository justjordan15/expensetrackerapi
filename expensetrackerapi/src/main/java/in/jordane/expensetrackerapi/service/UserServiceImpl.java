package in.jordane.expensetrackerapi.service;

import in.jordane.expensetrackerapi.entity.User;
import in.jordane.expensetrackerapi.entity.UserModel;
import in.jordane.expensetrackerapi.exceptions.ItemAlreadyExistsException;
import in.jordane.expensetrackerapi.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserModel user){
        if(userRepository.existsByEmail(user.getEmail())){
            throw new ItemAlreadyExistsException("User is already registered with email: " + user.getEmail());
        }
        User newUser = new User();
        BeanUtils.copyProperties(user, newUser);
        return userRepository.save(newUser);
    }



}
