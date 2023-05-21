package classes;

public class Nadador {
	
	//declarar atributos
	public Integer idade;
	public String nome;
	
	//Metodo construtor
	
	public Nadador(Integer idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	//Metodo Verificacao 
	
		public String Categoria() {
			if (this.idade>=5 && this.idade<=30 ) {
					if (this.idade>=5 && this.idade<=7) {
						return  "infantil A";
					} else {
						if (this.idade>=8 && this.idade <=11) {
							return  "infantil B ";
						} else {
							if (this.idade >= 12 && this.idade<=13) {
								return "Juvenil A ";
							} else {
								if (this.idade>=14 && this.idade<=17) {
									return "Juvenil B";
								} else {
									return "Adulto" ;
								}
							}
						}
					}
			} else {
				return "Nao pode fazer natação";
			}
		}
	
	

}
