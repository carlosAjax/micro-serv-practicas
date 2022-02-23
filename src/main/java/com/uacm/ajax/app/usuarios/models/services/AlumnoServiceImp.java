package com.uacm.ajax.app.usuarios.models.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uacm.ajax.app.usuarios.models.entity.Alumno;
import com.uacm.ajax.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImp implements IAlumnoService{

	@Autowired
	private AlumnoRepository dao;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		
		return dao.save(alumno);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.deleteById(id);
		
	}
	
	

}
