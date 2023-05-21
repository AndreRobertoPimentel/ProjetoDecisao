package exercicios;

import javax.swing.JOptionPane;

public class ZeDoOVO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Object[] menu = {"Ovo azul/coxinha/coca cola","Ovo rosa/esfiha/pinga","Ovo mole/conhaque","Ovo mexido /cafe/pao"};
		
		String codigo;
		int quantidade; 
		Float valorTotal = null;
		String cliente;
			
		
		
		//Entradas
		
		codigo = (String) JOptionPane.showInputDialog(null, "Escolha uma Opção", "O produto", JOptionPane.INFORMATION_MESSAGE,null, menu, "Ovo azul/coxinha/coca cola");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade vendida: "));
		cliente = JOptionPane.showInputDialog(" Entre com o Nome do Cliente: ");
		
		//processamento
		
		switch (codigo) {
		
		case "Ovo azul/coxinha/coca cola":
			valorTotal = quantidade * 10.30f;	
			break;
		case "Ovo rosa/esfiha/pinga":
			valorTotal = quantidade *13.20f;	
			break;
		case "Ovo mole/conhaque":
			valorTotal = quantidade * 9.50f;		
			break;
		case "Ovo mexido /cafe/pao":
			valorTotal =(float) (quantidade * 6.80);		
			break;
		
		default:  JOptionPane.showMessageDialog(null,"Codigo Invalido","O Produto",JOptionPane.WARNING_MESSAGE);	
			break;
		
		}
		
		//saida

		JOptionPane.showMessageDialog(null,"O cliente "+cliente+"\ncomprou "+ quantidade+" UN " +"\n do combo : "+ codigo +"\ne o valor total da compra foi "+ valorTotal + " Reais");
	}

}
