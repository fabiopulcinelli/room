package it.prova.room;

import it.prova.room.model.Room;
import it.prova.room.repository.RoomRepository;
import it.prova.room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class RoomController {

	@Autowired
	private RoomService roomService;

	@GetMapping("/test")
	public String test() {
		return "Ok";
	}

	@GetMapping()
	public List<Room> lista() {
		return roomService.listAllRooms();
    }

	@PostMapping("/findByNumero/{num}")
	public Room findByNumero(@PathVariable(value = "num", required = true) Integer num) {
		return roomService.findByNumero(num);
	}
}