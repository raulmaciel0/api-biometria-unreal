package com.virtuatech.biometria.biometria_api.services;

import com.virtuatech.biometria.biometria_api.model.Biometria;
import com.virtuatech.biometria.biometria_api.repositories.BiometriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiometriaService {
    public final BiometriaRepository biometriaRepository;

    public BiometriaService(BiometriaRepository biometriaRepository){
        this.biometriaRepository = biometriaRepository;
    }

    public List<Biometria> listarTodas(){
        return biometriaRepository.findAll();
    }

    public Biometria salvar(Biometria biometria){
        return biometriaRepository.save(biometria);
    }

    public void deletar(Long id){
        biometriaRepository.deleteById(id);
    }
}
