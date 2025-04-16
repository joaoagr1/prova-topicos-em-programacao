package system.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.prova.model.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
