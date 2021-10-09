package com.developer.games.challenge5.model;

import com.developer.games.challenge5.enums.RoomType;

import java.math.BigDecimal;

/**
 * Regular Room
 */
public class RegularRoom {

    /**
     * Attribute roomId of type String
     */
    protected Integer roomId;

    /**
     * Attribute numberOfBeds of type Integer
     */
    protected Integer numberOfBeds;

    /**
     * Attribute price of type BigDecimal
     */
    protected BigDecimal price;

    /**
     * Attribute roomType of type RoomType
     */
    protected RoomType roomType;

    /**
     * Attribute available of type Boolean
     */
    protected Boolean available;

    /**
     * Empty Room's Constructor
     */
    public RegularRoom() {
        this.available = true;
        this.roomType = RoomType.REGULAR_ROOM;
    }

    /**
     * Room's Constructor
     * @param numberOfBeds receives an Integer with numberOfBeds
     * @param hairDryer receives a Boolean with hairDryer
     * @param bathTub receives a Boolean with bathTub
     * @param price receives a BigDecimal with price
     */
    public RegularRoom(Integer roomId, Integer numberOfBeds, BigDecimal price) {
        this.available = true;
        this.roomType = RoomType.REGULAR_ROOM;
        this.roomId = roomId;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }


    /**
     * Getter of roomId
     * @return an Integer with roomId
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * Setter of roomId
     * @param roomId receives an Integer with roomId
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * Getter of numberOfBeds
     * @return an Integer with numberOfBeds
     */
    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Setter of numberOfBeds
     * @param numberOfBeds receives an Integer with numberOfBeds
     */
    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    /**
     * Getter of price
     * @return a BigDecimal with price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Setter of price
     * @param price receives a BigDecimal with price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Getter of available
     * @return a Boolean with available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * Setter of available
     * @param available receives a Boolean with available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * Getter of roomType
     * @return a RoomType with roomType
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Setter of roomType
     * @param roomType receives a RoomType with roomType
     */
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

}