package com.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {
	
	@Autowired
	private PeliculaDAO peliculaDAO;


	public PeliculaService(PeliculaDAO peliculaDAO) {
		this.peliculaDAO = peliculaDAO;
	}
	

	public void setPeliculaDAO(PeliculaDAO peliculaDAO) {
		this.peliculaDAO = peliculaDAO;
	}

	public List<Pelicula> pelisPorGenero(String genero) {

		return peliculaDAO
				.findAll()
				.stream()
				.filter(p->p.getGenero().equalsIgnoreCase(genero))
				.collect(Collectors.toCollection(ArrayList::new));
	}
}
