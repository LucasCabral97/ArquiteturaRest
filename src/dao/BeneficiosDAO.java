package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Beneficios;

public class BeneficiosDAO implements InterfaceDAO<Beneficios> {
	EntityManagerFactory emf = Conexao.getInstance();
	
	@Override
	public void salvar(Beneficios t){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		
		em.close(); 
	}

	@Override
	public void excluir(long id) {
		// TODO Auto-generated method stub
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Beneficios ben=new Beneficios(id);
		ben = em.find(Beneficios.class,ben.getId());
		em.remove(ben);
		em.getTransaction().commit();
		em.close();
	}
	
	@Override
	public void alterar(Beneficios t) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
	}

	@Override
	public List<Beneficios> listar() {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getInstance().createEntityManager();
		return em.createQuery("FROM " + Beneficios.class.getName()).getResultList();
	}

	
}
