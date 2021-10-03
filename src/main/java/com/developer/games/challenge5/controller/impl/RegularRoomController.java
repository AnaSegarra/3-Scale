package com.developer.games.challenge5.controller.impl;

import java.util.List;

import com.developer.games.challenge5.controller.interfaces.IRegularRoomController;
import com.developer.games.challenge5.model.RegularRoom;
import com.developer.games.challenge5.service.RegularRoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Regular Room's Controller
 */
@RestController
public class RegularRoomController implements IRegularRoomController {
    /**
     * Autowired of Regular Room Service
     */
    @Autowired
    private RegularRoomService regularRoomService;

    /**
     * Find All Regular Rooms
     * @return a list of RegularRoom
     */
    @GetMapping("/regular-rooms")
    @ResponseStatus(HttpStatus.OK)
    public List<RegularRoom> findAllRegularRooms(){
        return regularRoomService.findAll();
    }

    /**
     * Find Regular Room by Id
     * @param roomId receives an Integer with roomId
     * @return a RegularRoom
     */
    @GetMapping("/regular-rooms/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RegularRoom findRegularRoomById(@PathVariable("id") Integer roomId){
        return regularRoomService.findById(roomId);
    }

}