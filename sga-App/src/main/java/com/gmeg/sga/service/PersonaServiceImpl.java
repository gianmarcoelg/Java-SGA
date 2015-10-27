package com.gmeg.sga.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.gmeg.sga.domain.PersonaBE;
import com.gmeg.sga.eis.PersonaDao;
/*
 * Para que sea un EJB la implementamos como Stateless
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

	// se realiza una inyeccion de dependencia:
	@EJB
	private PersonaDao personaDao;
	
	//@Override
	public List<PersonaBE> listarPersonas() {
		/*List<PersonaBE> personas = new ArrayList<PersonaBE>();
		personas.add(new PersonaBE(1, "Juan", "Perez", "Suarez", "jperez@gmail.com", "999888777"));
		personas.add(new PersonaBE(2, "Martha", "Suarez", "Jimenez", "msuarez@gmail.com", "999111777"));
		return personas;*/
		return personaDao.findAllPersonas();
	}

	//@Override
	public PersonaBE encontrarPersona(PersonaBE persona) {
		return personaDao.findPersonaById(persona);	}	

	//@Override
	public PersonaBE encontrarPersonaPorEmail(PersonaBE persona) {
		return personaDao.findPersonaByEmail(persona);	}

	//@Override
	public void registrarPersona(PersonaBE persona) {
		personaDao.insertPersona(persona);
	}

	//@Override
	public void modificarPersona(PersonaBE persona) {
		personaDao.updatePersona(persona);
	}

	//@Override
	public void eliminarPersona(PersonaBE persona) {
		personaDao.deletePersona(persona);
	}

}
