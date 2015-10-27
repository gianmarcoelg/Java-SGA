package com.gmeg.sga.eis;

import java.util.List;

import com.gmeg.sga.domain.PersonaBE;

public interface PersonaDao {
	public List<PersonaBE> findAllPersonas();
	
	public PersonaBE findPersonaById(PersonaBE persona);
	
	public PersonaBE findPersonaByEmail(PersonaBE persona);
	
	public void insertPersona(PersonaBE persona);
	
	public void updatePersona(PersonaBE persona);
	
	public void deletePersona(PersonaBE persona);
	
}	
