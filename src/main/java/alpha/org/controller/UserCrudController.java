package alpha.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alpha.org.entity.User;
import alpha.org.service.ICrudService;

@RestController
@RequestMapping(name="/crud_user")
public class UserCrudController {

	@Autowired
	ICrudService<User, Long> userService;
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getAll();
	}
	
	@PostMapping
	public void addUser(@RequestBody User user) {
		userService.add(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.update(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.delete(id);
	}
}
