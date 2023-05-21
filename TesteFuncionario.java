package testes;

import javax.swing.JOptionPane;

import classes.Funcionario;


public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declara variaveis
		
		 String nome;
		 int identificacao ;
		 float salario;
			//entradas
			
		 nome = JOptionPane.showInputDialog("entre com o nome do funcionario : ");
		 identificacao = Integer.parseInt(JOptionPane.showInputDialog("entre com o numero de identificação : "));
		 salario = Float.parseFloat(JOptionPane.showInputDialog("entre com o  valor salario : "));
					
		//objeto
			
			
		Funcionario funcionario = new Funcionario (nome, identificacao,salario);
		
		
		//processamento
		funcionario.calcularReajusteSalario();
		 
		 
		//saida
			
		JOptionPane.showMessageDialog(null, funcionario.mostrarDados());
	}			

}
