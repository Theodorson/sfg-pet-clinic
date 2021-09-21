package spring.project.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
