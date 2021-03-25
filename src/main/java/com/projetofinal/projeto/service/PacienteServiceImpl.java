package com.projetofinal.projeto.service;

import com.projetofinal.projeto.model.Paciente;

public class PacienteServiceImpl extends BaseServiceImpl<Paciente, Long> implements PacienteService {
    public PacienteServiceImpl(PacienteRepository repository) {
        super(repository);
    }
}
