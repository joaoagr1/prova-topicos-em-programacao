package system.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.prova.model.domain.Emprego;
import system.prova.model.domain.Pessoa;

@Repository
public interface EmpregoRepository extends JpaRepository<Emprego, Long> {
}
