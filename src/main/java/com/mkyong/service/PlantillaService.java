package com.mkyong.service;

import java.util.List;

import com.mkyong.entity.Plantilla;
import com.mkyong.entity.Proyecto;
import com.mkyong.entity.Tipornf;

public interface PlantillaService {
	
	public void savePlantilla(Plantilla plantilla);
	
	public Plantilla findByid(int id);
	
	public List<Plantilla> findByIdProyectoAndIdTipoRnf(Proyecto proyecto, Tipornf tipoRnf);
	
	public void deletePlantilla(Plantilla plantilla);
}
