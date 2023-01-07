package wiwiel.training.sfgpetclinic.services;

import wiwiel.training.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
