package spring.project.sfgpetclinic.services;

import spring.project.sfgpetclinic.model.Pet;
import spring.project.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
