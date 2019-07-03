package coleção;

import java.util.ArrayList;
import java.util.List;

public class ComponenteDeSelecao {
	
	private List<selecionavel> a;
	private String name;
	
	
	public ComponenteDeSelecao(List<selecionavel> a,String name){
		this.a = a;
		this.name = name;
		
	}
	
	public List<selecionavel> geraListBox() {
		ArrayList<selecionavel> retorno = new ArrayList<selecionavel>();
		for(selecionavel k : a) {
			if( k.getNome().equals(this.name)) {
				retorno.add(k);
			}
		}
		return retorno;
		
	}
	
	

}
