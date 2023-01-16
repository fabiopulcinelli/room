package it.prova.room.service;

import it.prova.room.model.Room;

import java.util.List;

public interface RoomService {

    public List<Room> listAllRooms();

    public Room findByNumero(Integer numeroStanza);
}
