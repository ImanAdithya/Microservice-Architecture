package lk.ijse.microservice.controller;

import lk.ijse.microservice.dto.ItemDTO;
import lk.ijse.microservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lk.ijse.microservice.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public String saveItem(){
        //itemService.saveItem (itemDTO);
        return "Item saved";
    }

    @PostMapping("/editUser")
    public User editUser(@RequestBody User user){
        user.setName ("Scooby");
        return user;
    }
}
