package wiwiel.training.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wiwiel.training.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
