package wiwiel.training.sfgpetclinic.services;

import wiwiel.training.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findByLastNameLike(String lastName);
}
