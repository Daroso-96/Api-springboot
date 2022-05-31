package com.bluesoft.api.rest.Bluesoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluesoft.api.rest.Bluesoft.model.Cuenta;
@Repository
public interface ICuentaDao extends JpaRepository<Cuenta,Long>{

}
