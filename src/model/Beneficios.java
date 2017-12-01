package model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="Beneficios")
public class Beneficios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String descricao;
	private double vlrPorcento;
	private double vlrFixo;
	
	public Beneficios(long id){
		this.id=id;
	}
	public Beneficios(){
		
	}
	public Beneficios(long id,String desc,double vlrpor,double vlrfix){
		this.id=id;
		this.descricao=desc;
		this.vlrPorcento=vlrpor;
		this.vlrFixo=vlrfix;
	}
	public Beneficios(String desc,double vlrpor,double vlrfix){
		this.descricao=desc;
		this.vlrPorcento=vlrpor;
		this.vlrFixo=vlrfix;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getVlrPorcento() {
		return vlrPorcento;
	}
	public void setVlrPorcento(double vlrPorcento) {
		this.vlrPorcento = vlrPorcento;
	}
	public double getVlrFixo() {
		return vlrFixo;
	}
	public void setVlrFixo(double vlrFixo) {
		this.vlrFixo = vlrFixo;
	}
	
	
}
