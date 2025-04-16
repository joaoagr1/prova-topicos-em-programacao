package system.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.prova.model.domain.Appointment;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findAllByProviderId(Long providerId);

    List<Appointment> findAllByUserId(Long userId);
}
