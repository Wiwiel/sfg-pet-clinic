package wiwiel.training.sfgpetclinic.services;

import wiwiel.training.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);

    Vet findById (Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}