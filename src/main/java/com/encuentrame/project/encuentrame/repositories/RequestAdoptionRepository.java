package com.encuentrame.project.encuentrame.repositories;
import com.encuentrame.project.encuentrame.entities.Pet;
import com.encuentrame.project.encuentrame.entities.RequestAdoption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RequestAdoptionRepository extends JpaRepository<RequestAdoption, UUID> {

    public RequestAdoption findByPet(Pet pet);
}
