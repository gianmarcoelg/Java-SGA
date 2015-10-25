package com.gmeg.sga.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.gmeg.sga.domain.PersonaBE;
import com.gmeg.sga.service.PersonaServiceRemote;

public class ClientePersonaService {
	public static void main(String[] args) {
		System.out.println("Iniciando llamada al EJB desde el cliente\n");
		try {
			Context jndi = new InitialContext();
			PersonaServiceRemote personaService = (PersonaServiceRemote)
					jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.gmeg.sga.servicePersonaServiceRemote");
			
			List<PersonaBE> personas = personaService.listarPersonas();
			
			for(PersonaBE persona: personas){
				System.out.println(persona);
			}
			
			System.out.println("\nFin llamada al EJB desde el Cliente");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
