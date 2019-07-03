package coleção;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		
		Aluno a = new Aluno("João");
		Aluno b = new Aluno("Kaio");
		
		List<selecionavel> listaAlun = new ArrayList<>();
		listaAlun.add(a);
		listaAlun.add(b);
		
		ComponenteDeSelecao cds;
		cds = new ComponenteDeSelecao(listaAlun,"João");
		for(selecionavel h :cds.geraListBox()) {
			System.out.println(h.getNome());
		}
		
		
		Disciplina j = new Disciplina("Programação");
		Disciplina p = new Disciplina("Ética");
		
		List<selecionavel> listaDisc = new ArrayList<>();
		listaDisc.add(j);
		listaDisc.add(p);
		
		cds = new ComponenteDeSelecao(listaDisc,"Programação");
		for(selecionavel h : cds.geraListBox()){
			System.out.println(h.getNome());
			
		}
	}

}
