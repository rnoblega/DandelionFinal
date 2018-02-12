package com.mkyong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.entity.Plantilla;
import com.mkyong.entity.Proyecto;
import com.mkyong.entity.Tipornf;
import com.mkyong.repository.PlantillaRepository;

@Service ("plantillaService")
public class PlantillaServiceImpl implements PlantillaService {
	
	@Autowired
	private PlantillaRepository plantillaRepository;

	@Override
	public void savePlantilla(Plantilla plantilla) {
		plantillaRepository.save(plantilla);
		
	}

	@Override
	public Plantilla findByid(int id) {
		return plantillaRepository.findByid(id);
	}

	@Override
	public void deletePlantilla(Plantilla plantilla) {
		plantillaRepository.delete(plantilla);
		
	}

	@Override
	public List<Plantilla> findByIdProyectoAndIdTipoRnf(Proyecto proy, Tipornf tipoRnf) {
		System.out.println(proy.getId() + " " + tipoRnf.getId());
		return plantillaRepository.findByIdProyectoAndIdTipoRnf(proy, tipoRnf);
	}

}
