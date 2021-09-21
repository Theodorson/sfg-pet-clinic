package spring.project.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
