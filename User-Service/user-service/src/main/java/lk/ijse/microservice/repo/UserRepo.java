package lk.ijse.microservice.repo;

import lk.ijse.microservice.dto.UserDTO;
import lk.ijse.microservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {

}
