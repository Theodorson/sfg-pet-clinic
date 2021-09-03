package spring.project.sfgpetclinic.bootstrap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.project.sfgpetclinic.model.Owner;
import spring.project.sfgpetclinic.model.Vet;
import spring.project.sfgpetclinic.services.OwnerService;
import spring.project.sfgpetclinic.services.VetService;
import spring.project.sfgpetclinic.services.map.OwnerServiceMap;
import spring.project.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    //@Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jaxon");
        owner1.setLastName("Bob");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Dereck");
        owner2.setLastName("Johnson");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Raphael");
        vet1.setLastName("Phill");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Eddison");
        vet2.setLastName("Clark");

        vetService.save(vet2);

        System.out.println("Loaded vets...");






    }
}
