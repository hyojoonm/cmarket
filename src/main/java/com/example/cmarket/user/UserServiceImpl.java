package com.example.cmarket.user;

public class UserServiceImpl implements UserService{

    // private  final UserRepository userRepository = new UserRepositoryImpl();

    private final UserRepository  userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void signup(User user){
        userRepository.saveUser(user);
    }

    public User findUser(Long userId){
        return userRepository.findByUserId(userId);
    }
}
