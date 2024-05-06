package com.veterinary.repository;

import com.veterinary.models.MedicalOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalOrderRepository extends JpaRepository<MedicalOrder, Long> {
}
