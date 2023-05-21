package classes;

public class Esfera {

	public float raio ;
	public double volume ;
	

	 



	public Esfera(float raio) {
		super();
		this.raio = raio;
	}

	//metodo processamento
	
	public float calcularArea(){
		
		if (this.raio!=0) {
			return (float) (this.volume = (4.0/3.0*3.14159*this.raio*this.raio*this.raio));
		}else {
			return (float) (this.volume = 0);
		}
		
	}
	
	//metodo mostrar dados
	public String mostrarDados() {
		return " O Volume da esfera  é : "+ this.volume;
	}
}
