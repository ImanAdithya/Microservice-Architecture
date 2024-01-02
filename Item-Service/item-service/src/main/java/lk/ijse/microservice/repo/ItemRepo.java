package lk.ijse.microservice.repo;

import lk.ijse.microservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,String> {

}
