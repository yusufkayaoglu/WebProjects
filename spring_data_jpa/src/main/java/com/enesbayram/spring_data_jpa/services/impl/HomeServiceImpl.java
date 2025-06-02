package com.enesbayram.spring_data_jpa.services.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoHome;
import com.enesbayram.spring_data_jpa.DTO.DtoRoom;
import com.enesbayram.spring_data_jpa.entities.Home;
import com.enesbayram.spring_data_jpa.entities.Room;
import com.enesbayram.spring_data_jpa.repository.HomeRepository;
import com.enesbayram.spring_data_jpa.services.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public DtoHome findHomeById(Long id) {
        DtoHome dtoHome = new DtoHome();
        Optional<Home> optional = homeRepository.findById(id);

        if(optional.isEmpty()){
            return null;
        }
        Home dbHome = optional.get();
        List<Room>dbRooms = optional.get().getRoom();

        BeanUtils.copyProperties(dbHome, dtoHome);
        if(dbRooms!=null && !dbRooms.isEmpty()){
            for(Room room : dbRooms){
                DtoRoom dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(room, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }

        return dtoHome;
    }
}
