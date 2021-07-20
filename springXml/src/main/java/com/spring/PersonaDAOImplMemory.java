package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonaDAOImplMemory implements PersonaDAO {
	
	List<Persona> personas=new ArrayList<Persona>();

	public void init() throws Exception {
	insert(new Persona("Gabriel",27));
	insert(new Persona("Rebeca",22));
	insert(new Persona("Rosa",24));
	insert(new Persona("Marcos",21));
	insert(new Persona("Adrian",20));
	insert(new Persona("Raul",29));
		
	}

	@Override
	public Persona findByIndex(int index) {
		
		return personas.get(index);
	}

	@Override
	public List<Persona> findAll() {
		
		return personas;
	}

	@Override
	public void insert(Persona persona) {
		
		personas.add(persona);
	}

	@Override
	public void edit(int index, Persona persona) {
		personas.remove(index);
		personas.add(index, persona);
		
	}

	@Override
	public void delete(int index) {
		personas.remove(index);
		
	}

	@Override
	public void delete(Persona persona) {
		personas.remove(persona);
		
	}

	public void destroy() throws Exception {
		System.out.println("Limpiando la lista");
		personas.clear();
		
	}

}
