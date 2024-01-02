package lk.ijse.microservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.microservice.dto.UserDTO;
import lk.ijse.microservice.entity.User;
import lk.ijse.microservice.repo.UserRepo;
import lk.ijse.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;


    @Override
    public void saveUser(UserDTO userDTO) {
        userRepo.save (new User (userDTO.getUserID (),userDTO.getName ()));
    }
}
