package com.virtuatech.biometria.biometria_api.repositories;

import com.virtuatech.biometria.biometria_api.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

}
