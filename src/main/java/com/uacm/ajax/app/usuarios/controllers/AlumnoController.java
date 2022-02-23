package com.uacm.ajax.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uacm.ajax.app.usuarios.models.entity.Alumno;
import com.uacm.ajax.app.usuarios.models.services.IAlumnoService;

@RestController
public class AlumnoController {
	

	@Autowired 
	IAlumnoService service;
	
	@GetMapping("/")
	public ResponseEntity<?> listar(){
		
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> ver(@PathVariable Long id){
		Optional<Alumno> o = service.findById(id);
		if(o.isEmpty()) {
			
			return ResponseEntity.notFound().build();
		}
				
		return ResponseEntity.ok().body(o.get());
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Alumno alumno){
		Alumno alumnoBd = service.save(alumno);
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoBd);
	}
	
	@PutMapping
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id){
		Optional<Alumno> o = service.findById(id);
		if(o.isEmpty()) {
			
			return ResponseEntity.notFound().build();
		}
		Alumno alumnoBd = o.get();
		alumnoBd.setNombre(alumno.getNombre());
		alumnoBd.setApellido(alumno.getApellido());
		alumnoBd.setEmail(alumno.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoBd);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	

}
