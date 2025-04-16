package system.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.prova.model.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
