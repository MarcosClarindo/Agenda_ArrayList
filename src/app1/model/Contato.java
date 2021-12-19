package app1.model;

public class Contato {
	// Atributos
	private String nome;
	private int idade;
	private double salario;


	public Contato(String _nome, int _idade, double _salario) {

		this.nome = _nome;
		this.idade = _idade;
		this.salario = _salario;
	}

	// Get e Set
	public String getNome() {
		return this.nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int _idade) {
		this.idade = _idade;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double _salario) {
		this.salario = _salario;
	}

}
