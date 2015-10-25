package com.gmeg.sga.service;

import java.util.List;

import javax.ejb.Local;

import com.gmeg.sga.domain.PersonaBE;

@Local
public interface PersonaService {
	public List<PersonaBE> listarPersonas();

	public PersonaBE encontrarPersona(PersonaBE persona);

	public PersonaBE encontrarPersonaPorEmail(PersonaBE persona);

	public void registrarPersona(PersonaBE persona);

	public void modificarPersona(PersonaBE persona);

	public void eliminarPersona(PersonaBE persona);
}
