package com.virtuatech.biometria.biometria_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "colaboradores")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String cargo;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;

    @OneToMany(mappedBy = "colaborador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Biometria> biometrias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public List<Biometria> getBiometrias() {
        return biometrias;
    }

    public void setBiometrias(List<Biometria> biometrias) {
        this.biometrias = biometrias;
    }
}
