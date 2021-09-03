package spring.project.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import spring.project.sfgpetclinic.model.Vet;
import spring.project.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long ID) {
        return super.findById(ID);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long ID) {
        super.deleteById(ID);
    }
}