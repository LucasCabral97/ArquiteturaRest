package dao;

import model.Beneficios;

public class FactoryDAO {
	public static InterfaceDAO<Beneficios> cadastrar() {
		return new BeneficiosDAO();
	}
	public static InterfaceDAO<Beneficios> excluir(){
		return new BeneficiosDAO();
	}
	public static InterfaceDAO<Beneficios> listar(){
		return new BeneficiosDAO();
	}
	public static InterfaceDAO<Beneficios> alterar(){
		return new BeneficiosDAO();
	}
}
