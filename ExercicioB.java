package exercicios;

import javax.swing.JOptionPane;

public class ExercicioB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//declara entradas
		
				int n;
				
				//entradas
				
				n = Integer.parseInt(JOptionPane.showInputDialog("entre com um numero: "));
				
				
				//processamento 
				if ( n < 0 ) {
					n = n * ( -1 );
				}
				//saida
				
				JOptionPane.showMessageDialog(null,"o numero negativo e  : " + n );
	}

}
