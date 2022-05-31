package com.bluesoft.api.rest.Bluesoft.service;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.bluesoft.api.rest.Bluesoft.dao.ICuentaDao;
import com.bluesoft.api.rest.Bluesoft.model.Cuenta;

import java.util.List;
import java.util.Optional;
@Service
public class CuentaServicio  implements ICuentaDao{
@Autowired
private ICuentaDao icuentadao;
	@Override
	public List<Cuenta> findAll() {
		
		return icuentadao.findAll();
	}

	@Override
	public List<Cuenta> findAll(Sort sort) {
	
		return icuentadao.findAll(sort);
	}

	@Override
	public List<Cuenta> findAllById(Iterable<Long> ids) {
		
		return null;
	}

	@Override
	public <S extends Cuenta> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cuenta> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Cuenta> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> aLongs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cuenta getOne(Long aLong) {
	
		return icuentadao.getById(aLong);
	}

	@Override
	public Cuenta getById(Long aLong) {
	
		return icuentadao.getById(aLong);
	}

	@Override
	public <S extends Cuenta> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cuenta> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> S save(S entity) {
		
		return icuentadao.save(entity);
	}

	@Override
	public Optional<Cuenta> findById(Long aLong) {
		
		return null;
	}

	@Override
	public boolean existsById(Long aLong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		
		return icuentadao.count();
	}

	@Override
	public void deleteById(Long aLong) { 
		icuentadao.deleteById(aLong);
		
		
	}

	@Override
	public void delete(Cuenta entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> Longs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cuenta> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cuenta> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cuenta> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Cuenta> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Cuenta, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	} 
	 public Optional<Cuenta> getOne(long aLong) {
	        return icuentadao.findById(aLong);
	    }

}
