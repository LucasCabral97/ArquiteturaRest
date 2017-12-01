package dao;

import java.util.List;

public interface InterfaceDAO<T> {
	
	public void excluir(long id);	
	public void salvar(T t);	
	public void alterar(T t);	
	public List<T> listar();
}
