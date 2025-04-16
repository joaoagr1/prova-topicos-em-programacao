package system.prova.model.service;

import org.springframework.stereotype.Service;
import system.prova.model.domain.User;
import system.prova.model.repository.UserRepository;
import system.prova.model.util.CrudService;

@Service
public class UserService extends CrudService<User, Long> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
