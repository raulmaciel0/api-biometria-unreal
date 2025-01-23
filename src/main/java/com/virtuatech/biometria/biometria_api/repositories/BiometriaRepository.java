package com.virtuatech.biometria.biometria_api.repositories;

import com.virtuatech.biometria.biometria_api.model.Biometria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiometriaRepository extends JpaRepository<Biometria, Long> {
}
