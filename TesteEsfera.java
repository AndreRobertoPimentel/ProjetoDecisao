package testes;

import javax.swing.JOptionPane;

import classes.Esfera;

public class TesteEsfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//evariaveis
		float raio;
		
		//entrada
		
		raio = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do Raio : "));
		
		//Construtor
		
		Esfera esfera = new Esfera(raio);
		
		//processamento
		
		esfera.calcularArea();
		
		//Saida
		
		JOptionPane.showMessageDialog(null, esfera.mostrarDados());
		
	}

}
