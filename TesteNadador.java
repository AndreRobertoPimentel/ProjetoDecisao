package testes;

import javax.swing.JOptionPane;

import classes.Nadador;

public class TesteNadador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis

		int idade;
		String nome ;
		
		//entradas
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idadae do nadador "));
		nome = JOptionPane.showInputDialog("Digite o nome do nadador: ");
		
		//passar pelo construtor
		
		Nadador nadador = new Nadador(idade, nome);
		
		//Saida
		
		JOptionPane.showMessageDialog(null, nome + " Sua Categoria é :  " + nadador.Categoria());
		
		
	}

}
