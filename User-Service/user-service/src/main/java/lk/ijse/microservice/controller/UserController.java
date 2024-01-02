package lk.ijse.microservice.controller;

import lk.ijse.microservice.dto.UserDTO;
import lk.ijse.microservice.entity.User;
import lk.ijse.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String saveUser(){
      //  userService.saveUser (userDTO);
        // 1.url
        //2.data

        //Call Item Service Get Object
         return restTemplate.getForObject ("http://localhost:8082/api/v1/item",String.class);
        //Call Item Service Get Object
        //return restTemplate.postForObject ("", User,String.class);

    }


    @PostMapping("passUser")
    public User passUserToOrderService(@RequestBody User user){
        //System.out.println (user.getUserID ());
        return restTemplate.postForObject ("http://localhost:8082/api/v1/item/editUser",user,User.class);
    }
}
