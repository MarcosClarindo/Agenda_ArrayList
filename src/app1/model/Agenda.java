package app1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	//Cria a Lista de Contatos (Agenda)[GLOBAL]
	
	List<Contato> listaContato = new ArrayList<Contato>();
	
	public String cadastrarContatoService(Contato contato ) {
		
		// Verifica se os campos estão preenchidos
		if(contato.getNome().equals("")) {
			return "O campo nome é obrigatório";
		}
		
		// Adiciona um contato na agenda
		listaContato.add(contato);
		
		return "Cadastro efetuado com sucesso!";
	} // fecha o método cadastrarContatoService
	
	public String buscarContatoService() {
		
		// Guarda os valores buscado
		String resultado = "";
		
		// Guarda o tamanho da lista (quantidade de registro)
		int tamanhoLista = listaContato.size();
		//Verifica se há registro na lista
		if (tamanhoLista > 0) {
			 // Percorre a lista
			for (int i = 0; i < tamanhoLista; i++) {
				String contato = "ID: " + (i+1) + 
						"\nNome: " + listaContato.get(i).getNome() +
						"\nIdade: " + listaContato.get(i).getIdade() +
						"\nSalário: " + listaContato.get(i).getSalario() +
						"\n\n-----------\n";
				
				// Concatena com o resultado (se houver mais de 1)
				resultado += contato;
			} 
			
		} else {
			return " Nenhum resultado encontrado.";
		}
		
		return resultado;
		
	}// fecha o metódo buscarContatoService
	
	public String editarContatoService(Contato contato, int id) {
		
		// Atualia a lista (arraylist)
		listaContato.get(id - 1).setNome(contato.getNome());
		listaContato.get(id - 1).setIdade(contato.getIdade());
		listaContato.get(id - 1).setSalario(contato.getSalario());
		
		return "Cadastro editado Com sucesso!";
	}
	
	public String excluirContatoService(int id) {
		listaContato.remove(id - 1);
		return "Cadastro excluido com sucesso"; 
	}
}
