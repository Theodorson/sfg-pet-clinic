package spring.project.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import spring.project.sfgpetclinic.model.Speciality;
import spring.project.sfgpetclinic.services.SpecialityService;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long ID) {
        return super.findById(ID);
    }

    @Override
    public void deleteById(Long ID) {
        super.deleteById(ID);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }
}
