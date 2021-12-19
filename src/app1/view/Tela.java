package app1.view;

import javax.swing.JOptionPane;

public class Tela {
	
	// MONTA O MENU
	public String montarMenu() {
		
		// OPCÕES DO MEUNO
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
	}// fecha o método monstarMenu
	
	// Recebe os dados informados pelo usuário
	public String receberDados(String mensagem, String titulo, int icone) {
		
		return JOptionPane.showInputDialog(
				null,
				mensagem,
				titulo,
				icone);
	} // fecha o método receberDados
	
	// Mostrar o resultado
	public void mostraMensagem(String mensagem, String titulo, int icone) {
		
		JOptionPane.showMessageDialog(
				null, 
				mensagem,
				titulo,
				icone);
	}
	
	// Mostra a tela de confirmação 
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
