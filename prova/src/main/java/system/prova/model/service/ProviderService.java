package system.prova.model.service;

import org.springframework.stereotype.Service;
import system.prova.model.domain.Job;
import system.prova.model.domain.Provider;
import system.prova.model.repository.ProviderRepository;
import system.prova.model.util.CrudService;

@Service
public class ProviderService extends CrudService<Provider, Long> {
    public ProviderService(ProviderRepository repository) {
        super(repository);
    }

    public Provider addJobToProvider(Long providerId, Job job) {

        Provider provider = findById(providerId).orElseThrow();
        job.setProvider(provider);
        provider.getJobs().add(job);

        return save(provider);
    }
}
