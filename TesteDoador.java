package testes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.Doador; 

public class TesteDoador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declarar varias
		String nome;
		int peso;
		int idade;
		String genero;
		
		// entradas
		 nome = JOptionPane.showInputDialog("Entre com o nome do Doador : ");
		 peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do Doador : "));
		 idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Doador: "));
		 genero = JOptionPane.showInputDialog("Entre com o Genero do Doador :;").toUpperCase();
		 
		 //objetos
		
		 Doador doador = new Doador(nome, peso, idade, genero);
		 
		 // processamento
		 
		 doador.verificarQuantidadeDeSangue();
		 
		 //saida
		 
		 JOptionPane.showMessageDialog(null, doador.mostrarDados()+"\n"+ doador.verificarQuantidadeDeSangue(), "Formulario De Doação\n     Doe Sangue \n     Doe Vida", JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/imagem/image0.jpg"));
		 
		
	}

}
