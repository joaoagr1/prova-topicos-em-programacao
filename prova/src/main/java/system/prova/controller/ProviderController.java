package system.prova.controller;

import org.springframework.web.bind.annotation.*;
import system.prova.model.domain.Job;
import system.prova.model.domain.Provider;
import system.prova.model.service.ProviderService;
import system.prova.model.util.CrudController;

@RestController
@RequestMapping("/providers")
public class ProviderController extends CrudController<Provider, Long, ProviderService> {

    public ProviderController(ProviderService service) {
        super(service, Provider.class);
    }

    @PostMapping("/{providerId}/jobs")
    public Provider addJobToProvider(@PathVariable Long providerId, @RequestBody Job job) {
        return service.addJobToProvider(providerId, job);
    }

}
