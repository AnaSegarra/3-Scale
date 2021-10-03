package com.developer.games.challenge5.controller.interfaces;

import java.util.List;

import com.developer.games.challenge5.model.RegularRoom;

/**
 * Regular Room Controller Interface
 */
public interface IRegularRoomController {
    /**
     * Find All Regular Rooms
     * @return a list of RegularRoom
     */
    public List<RegularRoom> findAllRegularRooms();

    /**
     * Find Regular Room by Id
     * @param roomId receives an Integer with roomId
     * @return a RegularRoom
     */
    public RegularRoom findRegularRoomById(Integer roomId);

}