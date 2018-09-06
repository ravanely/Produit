package alpha.org.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alpha.org.entity.User;

@RestController
@RequestMapping("/crud_user")
public class UserCrudController extends CrudController<User, Long>{

	public List<User> getAll(){

		List<User> users = super.getAll();
		users.forEach(user -> user.setPassword(null));
		return users;
	}
}
