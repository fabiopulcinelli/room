package it.prova.room.repository;

import it.prova.room.model.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoomRepository extends CrudRepository<Room, Long>{

	Room findByNumeroStanza(Integer numeroStanza);
}
