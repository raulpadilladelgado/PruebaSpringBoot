package com.example.SpringData.rest;

import com.example.SpringData.modelos.Persona;
import com.example.SpringData.repositorios.IPersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
    @Autowired
    private IPersonaRepositorio repositorio;
    @GetMapping
    public List<Persona> listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Persona persona){
       repositorio.save(persona);
    }
    @PutMapping
    public void modificar(@RequestBody Persona persona){
        repositorio.save(persona);
    }
    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        repositorio.deleteById(id);
    }
}
