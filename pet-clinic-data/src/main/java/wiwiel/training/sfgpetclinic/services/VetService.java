package wiwiel.training.sfgpetclinic.services;

import wiwiel.training.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
    Vet findByLastName(String lastName);
}
