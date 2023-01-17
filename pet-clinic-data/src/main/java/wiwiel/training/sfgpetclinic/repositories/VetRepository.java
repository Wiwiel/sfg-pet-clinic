package wiwiel.training.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wiwiel.training.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
