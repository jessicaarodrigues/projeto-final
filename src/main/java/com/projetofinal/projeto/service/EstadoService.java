package com.projetofinal.projeto.service;

import com.projetofinal.projeto.model.Estado;

public interface EstadoService extends BaseService<Estado, Long{

    Estado findByUF(String uf);

}
