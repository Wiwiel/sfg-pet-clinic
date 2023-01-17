package wiwiel.training.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wiwiel.training.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
