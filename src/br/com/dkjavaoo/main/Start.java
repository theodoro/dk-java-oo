package br.com.dkjavaoo.main;

import javax.swing.JOptionPane;

import br.com.dkjavaoo.modelo.Pessoa;

public class Start {
	
	public static void main(String[] args){
		/*
		 * instanciando (criando objeto) Pessoa
		 */
		Pessoa novoPessoa = new Pessoa();
		
		/*
		 * Passando os valores para as variaveis
		 */
		
		String nome =
				JOptionPane.showInputDialog("Informe o nome do Usuário");
		
		novoPessoa.setNome(nome);
		
		String idade =
				JOptionPane.showInputDialog("Informe sua idade");
		
		novoPessoa.setIdade(Integer.parseInt(idade));
		
		/*
		 * Apresentando as informações
		 */
		
		System.out.println("Nome:" + novoPessoa.getNome() + "\n" + 
		"Idade:" + novoPessoa.getIdade());
	}

}
