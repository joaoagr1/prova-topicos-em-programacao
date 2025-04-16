package system.prova.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.prova.model.domain.Category;
import system.prova.model.service.CategoryService;
import system.prova.model.util.CrudController;

@RestController
@RequestMapping("/categories")
public class CategoryController extends CrudController<Category, Long, CategoryService> {
    public CategoryController(CategoryService service) {
        super(service, Category.class);
    }
}
