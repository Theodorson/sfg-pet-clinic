package spring.project.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
