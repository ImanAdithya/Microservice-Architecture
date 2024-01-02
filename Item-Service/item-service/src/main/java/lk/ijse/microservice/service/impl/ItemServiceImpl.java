package lk.ijse.microservice.service.impl;

import lk.ijse.microservice.dto.ItemDTO;
import lk.ijse.microservice.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lk.ijse.microservice.repo.ItemRepo;
import lk.ijse.microservice.service.ItemService;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepo itemRepo;


    @Override
    public void saveItem(ItemDTO itemDTO) {
        itemRepo.save (new Item (itemDTO.getItemID (),itemDTO.getName ()));
    }
}
