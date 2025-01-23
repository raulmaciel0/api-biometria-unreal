package com.virtuatech.biometria.biometria_api.services;

import com.virtuatech.biometria.biometria_api.model.Colaborador;
import com.virtuatech.biometria.biometria_api.repositories.ColaboradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {
    private final ColaboradorRepository colaboradorRepository;

    public ColaboradorService(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    public List<Colaborador> listarTodos(){
        return colaboradorRepository.findAll();
    }

    public Colaborador salvar(Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

    public void deletar(Long id){
        colaboradorRepository.deleteById(id);
    }
}
