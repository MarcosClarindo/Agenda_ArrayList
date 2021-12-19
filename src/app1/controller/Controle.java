package app1.controller;

import app1.model.Agenda;
import app1.model.Contato;
import app1.view.Tela;

public class Controle {
	
	// Cria os objetos das classes
	Tela tela = new Tela();
	Agenda agenda = new Agenda();
	
	// Método usado para iniciar a aplicação
	public void iniciarAplicativo() {
		
		// Cria os objetos das classes
		Tela tela = new Tela();
		Agenda agenda = new Agenda();
		
		// Ativa o sistema
		
		boolean menuPrincipal = true;
		
		while (menuPrincipal) {
			// Menu
			String opcaoEscolhida  = this.tela.montarMenu();
			
			// Chama o método conforme a opção escolhida
			switch(opcaoEscolhida) {
				
				case "0" :
					//menuPrincipal = false; // modo sinplificado
					menuPrincipal = confirmarSair(tela);
					break;
					
				case "1" :
					// Cadastrar contato
					cadastrar();
					break;
					
				case "2" : 
					// Buscar
					buscar();
					
					break;
					
				case "3" :
					// Editar
					editar();
					
					break;
					
				case "4" : 
					// Excluir
					excluir();
					break;
					
				default: 
					this.tela.mostraMensagem("Escolha uma das opções do menu.", "Atenção", 2);
			}
		}
	} // Fecha o método iniciarAplicativo
	
	private void cadastrar() {
		String titulo  =  "Cadastro de Contato";
		String nome    =  this.tela.receberDados("Inforne o nome", titulo, 1);
		String idade   =  this.tela.receberDados("Informe a idade", titulo, 1);
		String salario =  this.tela.receberDados("Informe o salário", titulo, 1);
		
		// Converte os valores numéricos
		try {
			int _idade      = Integer.parseInt(idade);
			double _salario = Double.parseDouble(salario);
			
			// Cria um objeto da classe Contato
			Contato contato = new Contato(nome, _idade, _salario);
			
			// Envia os dados para serem cadastrados no Sistema
			String mensagem = this.agenda.cadastrarContatoService(contato);
			
			// Mostra o resultado
			this.tela.mostraMensagem(mensagem,"Cadastro", 2);
			
		} catch (Exception e) {
			this.tela.mostraMensagem("Informe apenas números", "Atenção", 2);
		} 
		
	} // Fecha o método cadastrar
		
	private void buscar() {
		String resultadoDaBusca = this.agenda.buscarContatoService();
		this.tela.confirmarMensagem(resultadoDaBusca, "Contatos", 1);
	
	} // Fecha o método buscar
	
	private void editar () {
		buscar();
		
		String id = this.tela.receberDados("Informe o ID para editar", "Editar", 1);
		String novoNome = this.tela.receberDados("Informe o novo nome: ","Editar" , 1);
		String novaIdade = this.tela.receberDados("Informe a nova idade:" , "Editar", 1);
		String novoSalario = this.tela.receberDados("Informe o novo Salário: ", "Editar", 1);
		
		// Converte os valores numéricos
		try {
			int _id             =  Integer.parseInt(id);
			int _novaIdade      =  Integer.parseInt(novaIdade);
			double _novoSalario =  Double.parseDouble(novoSalario);
			
			// Cria um objeto da classe Contato
			Contato contato = new Contato(novoNome, _novaIdade, _novoSalario);
			
			// Envia os dados para serem atualizados no Sistema
			String mensagem = this.agenda.editarContatoService(contato, _id);
			
			// Mostra o resultado 
			this.tela.mostraMensagem(mensagem, "Editar", 3);
			
			
		} catch(Exception e) {
			this.tela.mostraMensagem("Informe apenas números!", "Atenção!", 2);
		}
	}// Fecha o método editar
	
	private void excluir () {
		buscar();
		String id = this.tela.receberDados("Informe o ID para excluir", "Excluir", 1);
		// Convertendo o valor String para Int
		try {
			int _id = Integer.parseInt(id);
			
			// Envia os dados para serem atualizados no sistema
			String mensagem = this.agenda.excluirContatoService( _id);
			
			// Mostra o resultado
			this.tela.mostraMensagem(mensagem, "Excluir", _id);
			
		} catch (Exception e) {
			this.tela.mostraMensagem("Informe apenas números", "Atenção", 2);
		}
		
		
		
		
		
		
	} // Fecha o método excluir
	
	// Confirmar Sair do Sistema
	private Boolean confirmarSair(Tela _tela) {
		
		int sair = this.tela.confirmarMensagem("Tem certeza?", "Encerrar o sistema", 3);
		
		//System.out.println("Retorno do YES NO: " + sair);
		
		if (sair == 0) {
			this.tela.mostraMensagem("Encerrando o Sistema...", "Encerrando", 1);
			return false;
		}
		
		return true; 
		/*
		// IF Ternário (O mesmo teste que foi usado acima com o IF)
		
		// Quem recebe;    Condição; SE      : SENÂO
			boolean menu = sair == 0 ? false : true;
			
			return menu;
			*/
		
	}
}
