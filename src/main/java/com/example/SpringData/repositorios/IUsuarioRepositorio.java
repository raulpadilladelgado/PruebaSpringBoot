package com.example.SpringData.repositorios;

import com.example.SpringData.modelos.Persona;
import com.example.SpringData.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepositorio extends JpaRepository<Usuario,Integer> {
    Usuario findByNombre(String nombre);
}
