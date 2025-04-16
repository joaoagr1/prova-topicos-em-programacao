package system.prova.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.prova.model.service.EmpregoService;
import system.prova.model.service.PessoaService;
import system.prova.model.util.CrudController;

@RestController
@RequestMapping("/empregos")
public class EmpregoController extends CrudController<system.prova.model.domain.Emprego, Long, EmpregoService> {
    public EmpregoController(EmpregoService service) {
        super(service, system.prova.model.domain.Emprego.class);
    }
}
