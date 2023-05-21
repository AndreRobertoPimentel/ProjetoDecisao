package exercicios;

import javax.swing.JOptionPane;

public class ExercicioC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variavel
		
		float nota1, nota2, nota3, nota4, media;
		String nome;
		//entradas
		
		nome = JOptionPane.showInputDialog("entre com o nome do Aluno: ");
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("entre com a 1 nota: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("entre com a 2 nota: "));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("entre com a 3 nota: "));
		nota4 = Float.parseFloat(JOptionPane.showInputDialog("entre com a 4 nota: "));
		
		//processamento
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		if (media>=5) {
			
			JOptionPane.showMessageDialog(null,nome + "sua media foi : " + media + " e voce esta aprovado." );
			
		} else {
			
			JOptionPane.showMessageDialog(null,nome + " sua media foi : " + media + " e voce esta reprovado." );
			
		}
		
		// teste de decisão
		
				
		
	}

}
