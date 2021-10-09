package com.developer.games.challenge5.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.developer.games.challenge5.model.RegularRoom;

import com.developer.games.challenge5.exception.DataNotFoundException;

/**
 * Regular Room Service
 */
@Service
public class RegularRoomService {

    /**
     * Final variable of Logger
     */
    //private static final Logger LOGGER = LogManager.getLogger(RegularRoomService.class);
    
    
    public List<RegularRoom> createRegularRoom(){
        //since dont have db2 connection, the values will be static
        BigDecimal room1Price = new BigDecimal("59.99");
        RegularRoom room1 = new RegularRoom(1, 2, room1Price);

        BigDecimal room2Price = new BigDecimal("89.99");
        RegularRoom room2 = new RegularRoom(2, 3, room2Price);

        List<RegularRoom> regularRoomList = new ArrayList<RegularRoom>();
        regularRoomList.add(room1);
        regularRoomList.add(room2);

       return regularRoomList;
    }

    

    /**
     * Find All Regular Rooms
     * @return a list of RegularRoom
     */
    public List<RegularRoom> findAll(){
        //LOGGER.info("Find All Regular Hotel Rooms");

        return this.createRegularRoom();
    }

    /**
     * Find Regular Room by id
     * @param roomId receives an Integer with roomId
     * @return a RegularRoom
     */
    public RegularRoom findById(Integer roomId){
        //LOGGER.info("Find Regular Hotel Room with id " + roomId);

        List<RegularRoom> regularRoomList = this.createRegularRoom();

        if(roomId == 1){
            return regularRoomList.get(0);
        } else if(roomId == 2){
            return regularRoomList.get(1);
        } else {
            throw new DataNotFoundException("Room id not found");
        }
    }


}