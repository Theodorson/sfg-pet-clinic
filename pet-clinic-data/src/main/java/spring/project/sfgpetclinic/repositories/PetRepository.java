package spring.project.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
