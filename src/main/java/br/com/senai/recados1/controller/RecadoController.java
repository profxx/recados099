package br.com.senai.recados1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.recados1.entity.Recado;
import br.com.senai.recados1.service.RecadoService;

@RestController
@RequestMapping("/recados")
public class RecadoController {

	@Autowired
	private RecadoService recadoService;
	
	@GetMapping
	public ResponseEntity<List<Recado>> findAll(){
		List<Recado> recados = recadoService.findAll();
		return ResponseEntity.ok().body(recados);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Recado> findById(@PathVariable Long id){
		Recado recado = recadoService.findById(id);
		return ResponseEntity.ok().body(recado);
	}
	
	
	
	
	
	
}
