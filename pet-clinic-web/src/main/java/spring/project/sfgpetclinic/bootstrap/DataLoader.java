package spring.project.sfgpetclinic.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.project.sfgpetclinic.model.*;
import spring.project.sfgpetclinic.services.OwnerService;
import spring.project.sfgpetclinic.services.PetTypeService;
import spring.project.sfgpetclinic.services.SpecialityService;
import spring.project.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    //@Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }

    }

    private void loadData() {
        PetType petType1 = new PetType();
        petType1.setName("Cat");
        PetType savedDog = petTypeService.save(petType1);

        PetType petType2 = new PetType();
        petType2.setName("Dog");
        PetType savedCat = petTypeService.save(petType2);

        System.out.println("Loaded pet types...");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jaxon");
        owner1.setLastName("Bob");
        owner1.setAddress("Str. Nr. 14");
        owner1.setCity("New York");
        owner1.setTelephone("0210201020");

        Pet escanor = new Pet();
        escanor.setName("Escanor");
        escanor.setBirthDate(LocalDate.now());
        escanor.setPetType(savedDog);
        escanor.setOwner(owner1);

        owner1.getPets().add(escanor);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Dereck");
        owner2.setLastName("Johnson");
        owner2.setAddress("Str. Nr. 14");
        owner2.setCity("New York");
        owner2.setTelephone("0210201020");

        Pet lila = new Pet();
        lila.setName("Lila");
        lila.setBirthDate(LocalDate.now());
        lila.setPetType(savedCat);
        lila.setOwner(owner2);
        owner2.getPets().add(lila);
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Raphael");
        vet1.setLastName("Phill");
        vet1.getSpecialities().add(savedSurgery);
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Eddison");
        vet2.setLastName("Clark");
        vet2.getSpecialities().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
