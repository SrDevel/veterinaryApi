package com.veterinary.repository;

import com.veterinary.models.Allergy;
import com.veterinary.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergyRepository extends JpaRepository<Allergy, Long> {
}
