package exercicios;

import javax.swing.JOptionPane;

public class Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Variaveis
		
		Object [] menu = {1001,1234,6548,4987,7623};// cria um menu para o cliente escolher.
		
		int codigo;
		int quantidade; 
		Float valorTotal = null;
				
		//Entradas
		
		codigo = (int) JOptionPane.showInputDialog(null, "Escolha uma opcao ", "O Produto", JOptionPane.INFORMATION_MESSAGE, null, menu, 1001);
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade vendida: "));
		
		//processamento
		
		switch (codigo) {
		 
		case 1001:
			valorTotal =(float) (quantidade * 5.32);	
			break;
		case 1234:
			valorTotal = quantidade * 6.45f;	
			break;
		case 6548:
			valorTotal = quantidade * 2.37f;		
			break;
		case 4987:
			valorTotal =(float) (quantidade * 9.92);		
			break;
		case 7623:
			valorTotal =(float) (quantidade * 7.43);		
			break;
		
		default:  JOptionPane.showMessageDialog(null,"Codigo Invalido","O Produto",JOptionPane.WARNING_MESSAGE);	
			break;
		
		}
		
		//saida

		JOptionPane.showMessageDialog(null,"Valor Total "+ valorTotal + "Reais");
		
		
		
	}

}
