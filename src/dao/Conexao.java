package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("ArquiteturaRest");
	
	private Conexao(){
		
	}

	public static EntityManagerFactory getInstance() {
		return emf;
	}
}
