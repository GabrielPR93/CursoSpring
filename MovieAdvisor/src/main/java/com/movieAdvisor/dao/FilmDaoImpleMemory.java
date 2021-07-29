package com.movieAdvisor.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.movieAdvisor.config.AppConfig;
import com.movieAdvisor.model.Film;

@Repository
public class FilmDaoImpleMemory implements FilmDao {

	@Autowired
	private AppConfig appConfig;

	public List<Film> peliculas = new ArrayList<>();

	@PostConstruct
	public void init() {
		peliculas = UtilFilmFileReader.readFile(appConfig.getFile(), appConfig.getSeparator(),
				appConfig.getListSeparator());
		
	}

	@Override
	public Film findById(long id) {

		Optional<Film> result = peliculas.stream().filter(f -> f.getId() == id).findFirst();
		return result.orElse(null);
	}

	@Override
	public Collection<Film> findAll() {

		return peliculas;
	}

	@Override
	public void insert(Film film) {
		peliculas.add(film);

	}

	@Override
	public void edit(Film film) {
		int index = getIndexOf(film.getId());
		if (index != -1)
			peliculas.set(index, film);

	}

	@Override
	public void delete(long id) {
		int index = getIndexOf(id);
		if (index != -1)
			peliculas.remove(index);
	}

	private int getIndexOf(long id) { //método que busca la película
		boolean encontrado = false;
		int index = 0;
		
		while (!encontrado && index < peliculas.size()) {
			if (peliculas.get(index).getId() == id)
				encontrado = true;
			else
				index++;
		}
		
		return (encontrado) ? index : -1;
	}
}
