package facade;

import java.util.ArrayList;

import dao.BeneficiosDAO;
import dao.FactoryDAO;
import dao.InterfaceDAO;
import model.Beneficios;

public class BeneficiosFACADE {
	public void cadastrarBeneficio(Beneficios beneficio){
		InterfaceDAO<Beneficios> dao= FactoryDAO.cadastrar();
		dao.salvar(beneficio);
	}
	public void excluirBeneficio(long id){
		InterfaceDAO<Beneficios> dao= FactoryDAO.excluir();
		dao.excluir(id);
	}
	public ArrayList<Beneficios> listar(){
		ArrayList<Beneficios> lista=new ArrayList<Beneficios>();
		InterfaceDAO<Beneficios> dao= FactoryDAO.listar();
		lista.addAll(dao.listar());
		return lista;
	}
	public void alterar(Beneficios beneficios){
		InterfaceDAO<Beneficios> dao= FactoryDAO.excluir();
		dao.alterar(beneficios);
	}
}
