package testes;

import javax.swing.JOptionPane;

import classes.Curso;

public class TestaCrurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variaveis
		String codigo, tipoPamento;
		
		//entradas
		
		codigo = JOptionPane.showInputDialog("Entre com o codigo do curso : ");
		tipoPamento = JOptionPane.showInputDialog("Entre com o tipo de pagamento (vista ou prazo : ");
		
		//objeto da classe
		
		Curso curso = new Curso(codigo, tipoPamento);
		
		//saida e processamento
		
		
		JOptionPane.showMessageDialog(null, "O Valor do Curso :"+ curso.calcularValor () + " Reais");
	}

}
