package spring.project.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import spring.project.sfgpetclinic.model.Owner;
import spring.project.sfgpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
        return super.save(object);
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
