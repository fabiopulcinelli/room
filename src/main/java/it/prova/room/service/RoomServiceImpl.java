package it.prova.room.service;

import it.prova.room.repository.RoomRepository;
import it.prova.room.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository repository;

    @Override
    public List<Room> listAllRooms() {
        return (List<Room>) repository.findAll();
    }

    @Override
    public Room findByNumero(Integer numeroStanza) {
        return repository.findByNumeroStanza(numeroStanza);
    }
}
