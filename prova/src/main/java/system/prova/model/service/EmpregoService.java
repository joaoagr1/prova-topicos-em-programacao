package system.prova.model.service;

import org.springframework.stereotype.Service;
import system.prova.model.repository.EmpregoRepository;
import system.prova.model.repository.PessoaRepository;
import system.prova.model.util.CrudService;

@Service
public class EmpregoService extends CrudService<system.prova.model.domain.Emprego, Long> {
    public EmpregoService(EmpregoRepository repository) {
        super(repository);
    }
}
