package spring.project.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import spring.project.sfgpetclinic.model.Owner;
import spring.project.sfgpetclinic.services.OwnerService;
import spring.project.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long ID) {
        return super.findById(ID);
    }

    @Override
    public Owner save(Owner object) {

        if (object != null){
            if (object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if (pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else
                    {
                        throw new RuntimeException("Pet Type is required");
                    }
                });
            }
            return super.save(object);
        }
        else{
            return null;
        }

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long ID) {
        super.deleteById(ID);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
