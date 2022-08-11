package com.example.cmarket.user;

public class UserServiceImpl implements UserService{

    private  final UserRepository userRepository = new UserRepositoryImpl();

    public void signup(User user){
        userRepository.saveUser(user);
    }

    public User findUser(Long userId){
        return userRepository.findByUserId(userId);
    }
}
