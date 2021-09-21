package spring.project.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
