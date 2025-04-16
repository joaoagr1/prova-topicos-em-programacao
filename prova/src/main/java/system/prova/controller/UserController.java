package system.prova.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.prova.model.domain.User;
import system.prova.model.service.UserService;
import system.prova.model.util.CrudController;

@RestController
@RequestMapping("/users")
public class UserController extends CrudController<User, Long, UserService> {
    public UserController(UserService service) {
        super(service, User.class);
    }
}
