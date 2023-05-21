package classes;

public class Doador {
	
	//atributos
	public String nome;
	public int peso ;
	public int idade;
	public String genero;
	
	//construtor
	public Doador(String nome, int peso, int idade, String genero) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.genero = genero;
	}
	
	//metodos mostrar dados
	
	public String mostrarDados(){
		return "O doador : " + this.nome  + "\ncom peso : "  + this.peso + " Kg. "+"\nidade : "+ this.idade +" anos. "+ "\nsendo do genero : " + this.genero +"." ;
	}
	
	//Processamento
	
	public String verificarQuantidadeDeSangue() {
		if (this.idade >=16 && this.idade<=69  && this.peso >= 50) {
			if (this.genero.equalsIgnoreCase("Masculino"))// testa todas as letras  
				{
				return "Você pode doar 700 ml de sangue.";
			} else {
				return "Você pode doar 400 ml de sangue."; 
			}
		} else {
			return "Você não pode Doar sangue" ;
		}
	}
}
