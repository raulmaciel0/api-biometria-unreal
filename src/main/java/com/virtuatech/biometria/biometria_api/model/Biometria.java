package com.virtuatech.biometria.biometria_api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Biometria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @JoinColumn(name = "colaborador_id", nullable = false)
    private Colaborador colaboradorId;

    @Column(nullable = false)
    private String template;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Colaborador getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(Colaborador colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
