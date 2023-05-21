package classes;

public class Curso {
	
	//declarar atributos 
	
	public String codigo;
	public String tipoDePagamento;
	public float valorCurso;
	
	//construtor
	public Curso(String codigo, String tipoDePagamento) {
		super();
		this.codigo = codigo;
		this.tipoDePagamento = tipoDePagamento;
	}
	
	//Metodo calcular valor 
	
	public float calcularValor() {
		
		if (this.codigo.equalsIgnoreCase("IGP")) {
			this.valorCurso = 1614.00f;
		} else {
			if (this.codigo.equalsIgnoreCase("ESP")) {
				this.valorCurso = 1200.00f;
			} else {
				this.valorCurso = 2400.00f;
			}
		}
		if (this.tipoDePagamento.equalsIgnoreCase("Vista")) {
			this.valorCurso=this.valorCurso*0.9f;
		}
		return this.valorCurso;
	}
	
}	



