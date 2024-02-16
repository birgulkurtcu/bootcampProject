package com.tobeto.demo.webapi;

import com.tobeto.demo.dataaccess.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UsersController {

    private UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @RequestMapping("/")
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @RequestMapping("/add")
    public void add() {
        User user = new User();
        user.setUserName("birgul");
        user.setEmail("birgulkurtcu@gmail.com");
        userRepository.save(user);

    }

}
