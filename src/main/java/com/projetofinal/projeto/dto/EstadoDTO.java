package com.projetofinal.projeto.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class EstadoDTO {
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String uf;


}
