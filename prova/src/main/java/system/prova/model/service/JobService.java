package system.prova.model.service;

import org.springframework.stereotype.Service;
import system.prova.model.domain.Job;
import system.prova.model.repository.JobRepository;
import system.prova.model.util.CrudService;

@Service
public class JobService extends CrudService<Job, Long> {
    public JobService(JobRepository repository) {
        super(repository);
    }
}
