package com.movieAdvisor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movieAdvisor.model.Film;
import com.movieAdvisor.service.FilmQueryService;
import com.movieAdvisor.service.FilmService;

@Component
public class MovieAdvisorRunApp {

	@Autowired
	public FilmService filmService;

	@Autowired
	public FilmQueryService filmQueryService;

	@Autowired
	public MovieAdvisorHelp movieAdvisorHelp;

	public void run(String[] args) {

		if (args.length < 1) {
			System.out.println("Error de sintaxis");
			System.out.println(movieAdvisorHelp.getHelp());
		} else if (args.length == 1) {
			switch (args[0].toLowerCase()) {
			case "-lg":
				filmService.findAllGenres().forEach(System.out::println);
				break;
			case "-h":
				System.out.println(movieAdvisorHelp.getHelp());
				break;
			default:
				System.out.println("Error de sintaxis");
				System.out.println(movieAdvisorHelp.getHelp());
			}
		} else if (args.length % 2 != 0) {
			System.out.println("Error de sintaxis");
			System.out.println(movieAdvisorHelp.getHelp());
		} else if (args.length > 8) {
			System.out.println("Error de sintaxis");
			System.out.println(movieAdvisorHelp.getHelp());
		} else {

			// Asi nos aseguramos que el número de argumentos
			// es par (opción valoropción) y que no hay más de cuatro
			// parejas.
			List<String[]> argumentos = new ArrayList<>();

			for (int i = 0; i < args.length; i += 2) { // de 2 en 2
				argumentos.add(new String[] { args[i], args[i + 1] });
			}

			boolean error = false;

			for (String[] argumento : argumentos) {
				switch (argumento[0].toLowerCase()) {
				case "-ag":
					filmQueryService.anyGenre(argumento[1].split(","));
					break;
				case "-tg":
					filmQueryService.allGenres(argumento[1].split(","));
					break;
				case "-y":
					filmQueryService.year(argumento[1]);
					break;
				case "-b":
					String[] years = argumento[1].split(",");
					filmQueryService.betweenYears(years[0], years[1]);
					break;
				case "-t":
					filmQueryService.titleContains(argumento[1]);
					break;
				default:
					error = true;
					System.out.println("Error de sintaxis");
					System.out.println(movieAdvisorHelp.getHelp());
				}

			}

			if (!error) {
				Collection<Film> result = filmQueryService.exec();
				System.out.printf("%s\t%-50s\t%s\t%s\n", "ID", "Título", "Año", "Géneros");
				if (result != null) {
					result.forEach(f -> System.out.printf("%s\t%-50s\t%s\t%s\n", f.getId(), f.getTitle(), f.getYear(),
							f.getGenres().stream().collect(Collectors.joining(", "))));
				} else {
					System.out.println("No hay películas que cumplan esos criterios. Lo sentimos");
				}
			}
		}

	}
}
