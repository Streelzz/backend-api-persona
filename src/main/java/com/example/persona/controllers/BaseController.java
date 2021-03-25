package com.example.persona.controllers;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.persona.entities.Base;

public interface BaseController<E extends Base, ID extends Serializable> {
	
	public ResponseEntity<?> getAll();
	public ResponseEntity<?> getOne(@PathVariable ID id);
	public ResponseEntity<?> save(@RequestBody E entidad);
	public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entidad);
	public ResponseEntity<?> delete(@PathVariable ID id);
}
