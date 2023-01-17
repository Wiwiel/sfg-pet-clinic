package wiwiel.training.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wiwiel.training.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
