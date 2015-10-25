package com.gmeg.sga.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.gmeg.sga.domain.PersonaBE;
/*
 * Para que sea un EJB la implementamos como Stateless
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

	@Override
	public List<PersonaBE> listarPersonas() {
		List<PersonaBE> personas = new ArrayList<PersonaBE>();
		personas.add(new PersonaBE(1, "Juan", "Perez", "Suarez", "jperez@gmail.com", "999888777"));
		personas.add(new PersonaBE(2, "Martha", "Suarez", "Jimenez", "msuarez@gmail.com", "999111777"));
		return personas;
	}

	@Override
	public PersonaBE encontrarPersona(PersonaBE persona) {
		// TODO Auto-generated method stub
		return null;
	}	

	@Override
	public PersonaBE encontrarPersonaPorEmail(PersonaBE persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrarPersona(PersonaBE persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificarPersona(PersonaBE persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarPersona(PersonaBE persona) {
		// TODO Auto-generated method stub

	}

}
