package com.zifang.springboot.web.restful;

import com.zifang.springboot.entity.User;
import com.zifang.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test_db")
    public User t(@RequestParam(value = "userName") String userName){
        User user = userRepository.findByName(userName);
        return user;
    }
}
