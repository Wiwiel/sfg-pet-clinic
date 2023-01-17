package wiwiel.training.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wiwiel.training.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
