package com.example.persona.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persona.entities.Localidad;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.DomicilioRepository;
import com.example.persona.repositories.LocalidadRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    
	@Autowired
    private LocalidadRepository localidadRepository;
	
	public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
