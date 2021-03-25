package com.projetofinal.projeto.service;

import com.projetofinal.projeto.model.Municipio;

public class MunicipioServiceImpl extends BaseServiceImpl<Municipio, Long> implements MunicipioService {
    public MunicipioImpl(MunicipioRepository repository) {
        super(repository);
    }
}
