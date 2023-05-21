package classes;

public class Funcionario {

	//declarando objetos 
	public String nome;
	public int identificacao ;
	public float salario;
	
	
	//geral contrutor 
	
	public Funcionario(String nome, int identificacao, float salario) {
		super();
		this.nome = nome;
		this.identificacao = identificacao;
		this.salario = salario;
	}
	
	//metodos
	
	public Float calcularReajusteSalario() {
		if (this.salario > 500) {
			
			if (this.salario<= 1000) {
				
				this.salario = (float) (this.salario * 1.10);
				
			} else {
				
				this.salario = (float) (this.salario * 1.05);
				
			}
			
		} else {
			
			this.salario = (float) (this.salario * 1.15);
		
		}
		return this.salario;
	}
	
	public String mostrarDados(){
		return this.nome  + "  seu salario passara a ser : " + this.salario;
	}
	
}
