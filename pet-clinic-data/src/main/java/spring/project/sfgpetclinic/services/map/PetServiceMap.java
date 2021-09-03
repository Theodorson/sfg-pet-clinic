package spring.project.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import spring.project.sfgpetclinic.model.Pet;
import spring.project.sfgpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long ID) {
        return super.findById(ID);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long ID) {
        super.deleteById(ID);
    }
}
