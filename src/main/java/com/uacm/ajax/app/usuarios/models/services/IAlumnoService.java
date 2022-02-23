package com.uacm.ajax.app.usuarios.models.services;


import java.util.Optional;

import com.uacm.ajax.app.usuarios.models.entity.Alumno;

public interface IAlumnoService {
	
	Iterable<Alumno>findAll();
	Optional<Alumno> findById(Long id);
	Alumno save(Alumno alumno);
	void delete(Long id);
	

}
