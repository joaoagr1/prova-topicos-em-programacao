package system.prova.model.util;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class FakeEntity {
    @Id
    private Long id;
    private String name;
}

@Repository
interface FakeRepository extends JpaRepository<FakeEntity, Long> {}

@Service
class FakeService extends CrudService<FakeEntity, Long> {
    public FakeService(FakeRepository repository) {
        super(repository);
    }
}
