package com.projetofinal.projeto.controller;

import com.projetofinal.projeto.converter.MunicipioConverter;
import com.projetofinal.projeto.dto.EstadoDTO;
import com.projetofinal.projeto.service.MunicipioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/municipios")
public class MunicipioController {
    private final MunicipioService municipioService;
    private final MunicipioConverter municipioConverter;

    public MunicipioController(MunicipioConverter municipioConverter) {
        this.municipioConverter = municipioConverter;
        this.municipioService = municipioService;
    }

    @PostMapping("")
    public EstadoDTO create(RequestBody CreateMunicipioDTO municipio) {
        Estado mappedMunicipio = this.municipioConverter.convertToEntity(municipios);
        return this.municipioConverter.convertToDTO(this.municipioService.create(mappedMunicipio));
    }

    @GetMapping
    public List<Municipio> findAll() {
        return this.municipioService.findAll();
    }

    @GetMapping("/{id}")
    public Municipio findById(@PathVariable Long id) {
        return this.municipioService.findById(id);
    }

    @PutMapping("/{id}")
    public Municipio update(@PathVariable Long id, @RequestBody Municipio municipios) {
        return this.municipioService.update(id, municipios);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.municipioService.delete(id);
    }
}
