package com.gmeg.sga.eis.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gmeg.sga.domain.PersonaBE;
import com.gmeg.sga.eis.PersonaDao;

@Stateless
public class PersonaDaoImpl implements PersonaDao {

	
	//Interactuar con objeto de base de datos:
	// el cual esta declarado en el archivo persistence.xml
	@PersistenceContext(unitName="PersonaPU")
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PersonaBE> findAllPersonas() {
		return em.createNamedQuery("Persona.findAll").getResultList();
	}

	@Override
	public PersonaBE findPersonaById(PersonaBE persona) {
		return em.find(PersonaBE.class, persona.getIdPersona());
	}

	@Override
	public PersonaBE findPersonaByEmail(PersonaBE persona) {
		Query query = em.createQuery("FROM Persona p WHERE p.email = :email");
		query.setParameter("email", persona.getEmail());
		return (PersonaBE) query.getSingleResult();
			
	}

	@Override
	public void insertPersona(PersonaBE persona) {
		em.persist(persona);
	}

	@Override
	public void updatePersona(PersonaBE persona) {
		em.merge(persona);
	}

	@Override
	public void deletePersona(PersonaBE persona) {
		//no se puede eliminar directamente por que primero tiene que detectarlo en memoria por eso
		// se agrega el merge
		em.merge(persona);
		em.remove(persona);

	}

}
