package system.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.prova.dto.PessoaDTO;
import system.prova.model.domain.Emprego;
import system.prova.model.domain.Pessoa;
import system.prova.model.service.EmpregoService;
import system.prova.model.service.PessoaService;
import system.prova.model.util.CrudController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController extends CrudController<system.prova.model.domain.Pessoa, Long, PessoaService> {
    public PessoaController(PessoaService service, EmpregoService empregoService, PessoaService pessoaService) {
        super(service, system.prova.model.domain.Pessoa.class);
        this.empregoService = empregoService;
        this.pessoaService = pessoaService;
    }

    private final EmpregoService empregoService;
    private final PessoaService pessoaService;

    @PostMapping("/create-with-job")
    public Pessoa createPessoa(@RequestBody PessoaDTO pessoaDTO) {
        Emprego emprego = empregoService.findById(pessoaDTO.getEmpregoId())
                .orElseThrow(() -> new IllegalArgumentException("Emprego não encontrado"));

        Pessoa pessoa = new Pessoa();
        pessoa.setName(pessoaDTO.getName());
        pessoa.setAge(pessoaDTO.getAge());
        pessoa.setEmprego(emprego);

        return pessoaService.save(pessoa);
    }

}
