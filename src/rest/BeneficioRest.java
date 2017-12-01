package rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.BeneficiosDAO;
import model.Beneficios;
import service.BeneficiosSERVICE;
@Path("/beneficiosrest")
public class BeneficioRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Beneficios> listar(){
		ArrayList<Beneficios> lista=new ArrayList<Beneficios>();
		BeneficiosSERVICE bene=new BeneficiosSERVICE();
		lista.addAll(bene.listar());
		return lista;
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Beneficios beneficios){
		System.out.println(1);
		new BeneficiosDAO().salvar(beneficios);
	}	
	
}
