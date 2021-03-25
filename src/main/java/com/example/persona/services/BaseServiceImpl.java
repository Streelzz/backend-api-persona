package com.example.persona.services;

import com.example.persona.entities.Base;
import com.example.persona.repositories.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
    }

	@Override
	@Transactional
	public List<E> findAll() throws Exception {
		try {
			List<E> entidades = baseRepository.findAll();
			return entidades;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}

	@Override
	@Transactional
	public E findById(ID id) throws Exception {
		try {
			Optional<E> entidad = baseRepository.findById(id);
			return entidad.get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}

	@Override
	@Transactional
	public E save(E entidad) throws Exception {
		try {
			entidad = baseRepository.save(entidad);
			return entidad;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}

	@Override
	@Transactional
	public E update(ID id, E entidad) throws Exception {
		try {
			
			Optional<E> entidadOptional = baseRepository.findById(id);
			E entidadUpdate = entidadOptional.get();
			entidadUpdate = baseRepository.save(entidad);
			return entidadUpdate;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}

	@Override
	@Transactional
	public boolean delete(ID id) throws Exception {
		try {
			if(baseRepository.existsById(id)){
				baseRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	
	}
}
