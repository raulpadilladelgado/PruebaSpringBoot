package com.example.SpringData.controladores;

import com.example.SpringData.modelos.Persona;
import com.example.SpringData.repositorios.IPersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class WelcomeController {
        @Autowired
        private IPersonaRepositorio repositorio;
        @GetMapping("/welcome")
        public String welcome(@RequestParam(name="name",required = false,defaultValue = "suso") String name, Model model) {
            Persona p = new Persona();
            p.setIdPersona((int) repositorio.count());
            p.setNombre(name);
            repositorio.save(p);
            model.addAttribute("name", name);
            return "welcome";
        }

    @GetMapping("/listar")
    public String todasLasPersonas(Model model) {
        model.addAttribute("personas",repositorio.findAll());
        return "personas";
    }
}
