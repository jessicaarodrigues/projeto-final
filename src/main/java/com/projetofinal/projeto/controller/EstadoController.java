package com.projetofinal.projeto.controller;

import com.projetofinal.projeto.converter.EstadoConverter;
import com.projetofinal.projeto.dto.EstadoDTO;
import com.projetofinal.projeto.model.Estado;
import com.projetofinal.projeto.service.EstadoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/estados")
public class EstadoController {
    private EstadoService estadoService = new EstadoService();
    private final EstadoConverter estadoConverter;

    public EstadoController(EstadoConverter estadoConverter) {
        this.estadoConverter = estadoConverter;
        this.estadoService = estadoService;
    }

    @PostMapping("")
    public <estado> EstadoDTO create(RequestBody CreateEstadoDTO estado) {
        Estado mappedEstado = this.estadoConverter.convertToEntity(estado);
        return this.estadoConverter.convertToDTO(this.estadoService.create(mappedEstado));
    }

    @GetMapping
    public List<Estado> findAll() {
        return this.estadoService.findAll();
    }

    @GetMapping("/{id}")
    public Estado findById(@PathVariable Long id) {
        return this.estadoService.findById(id);
    }

    @PutMapping("/{id}")
    public Estado update(@PathVariable Long id, @RequestBody Estado estados) {
        return this.estadoService.update(id, estados);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.estadoService.delete(id);
    }
}
