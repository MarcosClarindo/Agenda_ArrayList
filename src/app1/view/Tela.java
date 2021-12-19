package app1.view;

import javax.swing.JOptionPane;

public class Tela {
	
	// MONTA O MENU
	public String montarMenu() {
		
		// OPC�ES DO MEUNO
		String menu = "1.Cadastrar Contato"
				+ "\n2. Buscar Contato"
				+ "\n3. Editar Contato"
				+ "\n4. Excubluir Contato"
				+ "\n0. Sair"
				+ "\n\n";
		return JOptionPane.showInputDialog(
				null,
				menu, // Mensagem
				":: AGENDA de CONTATOS ::", // Titulo
				-1);
	}// fecha o m�todo monstarMenu
	
	// Recebe os dados informados pelo usu�rio
	public String receberDados(String mensagem, String titulo, int icone) {
		
		return JOptionPane.showInputDialog(
				null,
				mensagem,
				titulo,
				icone);
	} // fecha o m�todo receberDados
	
	// Mostrar o resultado
	public void mostraMensagem(String mensagem, String titulo, int icone) {
		
		JOptionPane.showMessageDialog(
				null, 
				mensagem,
				titulo,
				icone);
	}
	
	// Mostra a tela de confirma��o 
	public int confirmarMensagem(String mensagem, String titulo, int icone) {
		
		/*return JOptionPane.showConfirmDialog(
				null, 
				mensagem,
				titulo,
				icone);	*/
		return JOptionPane.showConfirmDialog(
				null, 
				mensagem,
				titulo,
				JOptionPane.YES_NO_OPTION,
				icone);
	}
}
