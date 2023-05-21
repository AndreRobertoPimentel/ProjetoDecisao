package exercicios;

import javax.swing.JOptionPane;

public class Produto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] menu = {"ABCD","XYPK","KLMP","QRST"};
		
		String codigo;
		int quantidade; 
		Float valorTotal = null;
		String cliente;
			
		
		
		//Entradas
		
		codigo = (String) JOptionPane.showInputDialog(null, "Escolha uma Opção", "O produto", JOptionPane.INFORMATION_MESSAGE,null, menu, "ABCD");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade vendida: "));
		cliente = JOptionPane.showInputDialog(" Entre com o Nome do Cliente: ");
		
		//processamento
		
		switch (codigo) {
		
		case "ABCD":
			valorTotal = quantidade * 5.30f;	
			break;
		case "XYPK":
			valorTotal = quantidade * 6.00f;	
			break;
		case "KLMP":
			valorTotal = quantidade * 3.20f;		
			break;
		case "QRST":
			valorTotal =(float) (quantidade * 2.50);		
			break;
		
		default:  JOptionPane.showMessageDialog(null,"Codigo Invalido","O Produto",JOptionPane.WARNING_MESSAGE);	
			break;
		
		}
		
		//saida

		JOptionPane.showMessageDialog(null,"O cliente "+cliente+"\ncomprou "+ quantidade+ "\n da peça com o codigo: "+ codigo +"\ne o valor total da compra foi "+ valorTotal + " Reais");
	}
	

}
