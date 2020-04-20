package com.example.SpringData;

import com.example.SpringData.modelos.Usuario;
import com.example.SpringData.repositorios.IUsuarioRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringDataApplicationTests {
	@Autowired
	private IUsuarioRepositorio repositorio_usuarios;
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	void crearUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setClave(encoder.encode("1234"));
		String expected = usuario.getClave();
		usuario.setNombre("pady");
		Usuario actual = repositorio_usuarios.save(usuario);
		assertEquals(expected,actual.getClave());
	}

}
