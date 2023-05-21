package testes;

import javax.swing.JOptionPane;

import classes.Pacientes;

public class TestaPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declara variaveis
	
		String nome, genero;
		float altura;
		
		//entradas
		
		nome = JOptionPane.showInputDialog("entre com o nome do paciente : ");
		genero = JOptionPane.showInputDialog("entre com o genero : ").toUpperCase();// touppercase converte para maiuscula.
		altura = Float.parseFloat(JOptionPane.showInputDialog("entre com a Altura : "));
				
		//objeto
		
		Pacientes paciente = new Pacientes(nome, genero, altura);
		
		//saida
		
		JOptionPane.showMessageDialog(null, "Peso ideal: "+ paciente.calcularPesoIdeal() + " Kg");
				
	}

}
