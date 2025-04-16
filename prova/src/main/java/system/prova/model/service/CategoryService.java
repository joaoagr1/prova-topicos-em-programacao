package system.prova.model.service;

import org.springframework.stereotype.Service;
import system.prova.model.domain.Category;
import system.prova.model.repository.CategoryRepository;
import system.prova.model.util.CrudService;

@Service
public class CategoryService extends CrudService<Category, Long> {
    public CategoryService(CategoryRepository repository) {
        super(repository);
    }
}
