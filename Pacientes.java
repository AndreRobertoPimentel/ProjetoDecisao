package classes;

public class Pacientes {

	public String nome;
	public String genero ;
	public float altura;
	
	
	public Pacientes(String nome, String genero, float altura) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.altura = altura;
	}
	//metodo
	
	public Float calcularPesoIdeal() {
		if (this.genero.equals("masculino") ) {
			return (float) ((72.7 * this.altura) -58) ;
		} else {
			return (float) ((62.1 * this.altura) -44.7);
		}
	}
	
	public String mostrarDados(){
		return " o Nome do paciente é : " + this.nome + " e seu genero é " + this.genero + " e sua altura é: " + this.altura;
	}
	
	
}

