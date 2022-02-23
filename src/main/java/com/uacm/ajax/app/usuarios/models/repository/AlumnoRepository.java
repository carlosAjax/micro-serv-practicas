package com.uacm.ajax.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.uacm.ajax.app.usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
