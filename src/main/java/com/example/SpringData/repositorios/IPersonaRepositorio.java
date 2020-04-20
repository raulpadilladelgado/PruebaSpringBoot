package com.example.SpringData.repositorios;

import com.example.SpringData.modelos.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepositorio extends JpaRepository<Persona,Integer> {
}
