package com.mkyong.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mkyong.entity.Plantilla;
import com.mkyong.entity.Proyecto;
import com.mkyong.entity.Tipornf;

@Repository
public interface PlantillaRepository extends CrudRepository<Plantilla, Long>{

	public void delete(Plantilla plantilla);
	
	public Plantilla findByid(int id);
	
	public List<Plantilla> findByIdProyectoAndIdTipoRnf ( Proyecto proy, Tipornf tipoRnf);
	
}


