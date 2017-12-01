package service;

import java.util.ArrayList;

import dao.FactoryDAO;
import dao.InterfaceDAO;
import facade.BeneficiosFACADE;
import model.Beneficios;

public class BeneficiosSERVICE {
	BeneficiosFACADE ben=new BeneficiosFACADE();
	public void cadastar(String descricao,double vlrPorcento,double vlrfixo){
		boolean op=true;
		if(descricao==null){
			op=false;
		}
		if(vlrPorcento>100){
			op=false;
		}
		if(op==true){
			Beneficios beneficio=new Beneficios(descricao,vlrPorcento,vlrfixo);
			ben.cadastrarBeneficio(beneficio);
		}
	}
	public void excluir(long id){
		if(id>0){
			ben.excluirBeneficio(id);
		}
	}
	public ArrayList<Beneficios> listar(){
		ArrayList<Beneficios> lista=new ArrayList<Beneficios>();
		lista.addAll(ben.listar());
		return lista;
	}
	public void alterar(long id,String descricao,double vlrPorcento,double vlrfixo){
		boolean op=true;
		if(descricao==null){
			op=false;
		}
		if(vlrPorcento>100){
			op=false;
		}
		if(id==0){
			
		}
		if(op==true){
			Beneficios beneficio=new Beneficios(id,descricao,vlrPorcento,vlrfixo);
			ben.alterar(beneficio);
		}
	}
}
