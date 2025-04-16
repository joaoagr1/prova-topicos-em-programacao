package system.prova.model.service;

import org.springframework.stereotype.Service;
import system.prova.model.repository.PessoaRepository;
import system.prova.model.util.CrudService;

@Service
public class PessoaService extends CrudService<system.prova.model.domain.Pessoa, Long> {
    public PessoaService(PessoaRepository repository) {
        super(repository);
    }
}
