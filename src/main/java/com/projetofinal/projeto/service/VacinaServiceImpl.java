package com.projetofinal.projeto.service;

import com.projetofinal.projeto.model.Vacina;

public class VacinaServiceImpl extends BaseServiceImpl<Vacina, Long> implements VacinaService {
    public VacinaServiceImpl(VacinaRepository repository) {
        super(repository);
    }
}
