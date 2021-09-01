package spring.project.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID>{

    Set<T> findAll();

    T findById(Long ID);

    T save (T object);

    void delete(Long ID);

    void deleteById(Long ID);

}
