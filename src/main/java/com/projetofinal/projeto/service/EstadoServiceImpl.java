package com.projetofinal.projeto.service;

import com.projetofinal.projeto.model.Estado;

import javax.persistence.EntityNotFoundException;

public class EstadoServiceImpl extends BaseServiceImpl<Estado, Long> implements EstadoService{
    private final EstadoRepository estadoRepository;

    public EstadoServiceImpl(EstadoRepository repository) {
        super(repository);
        this.estadoRepository = repository;
    }

    @Override
    public Estado findByUF(String uf) {
        return this.estadoRepository.findBySiglaEquals(uf)
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format("Estado com UF %s não encontrado", uf)));
    }
}
