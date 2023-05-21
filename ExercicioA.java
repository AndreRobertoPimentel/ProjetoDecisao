package exercicios;

import javax.swing.JOptionPane;

public class ExercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declara entradas
		
		int num1,num2,diferenca=0;
		
		//entradas
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("entre com o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("entre com o segundo número: "));
		
		//processamento 
		
		if (num1>num2) {
			diferenca = num1 - num2;
		}else {
			diferenca = num2 - num1;
		}
		//saida
		
		JOptionPane.showMessageDialog(null,"A diferenca entre eles é : " + diferenca );
		
	}

}
