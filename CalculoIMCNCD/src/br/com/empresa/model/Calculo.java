package br.com.empresa.model;

public class Calculo {
	
	private double altura;
	private double peso;
	private double idade;
	private String sexo;
	private String atividade;
	
	//CONSTRUTOR PARA INSTANCIAR 
	public Calculo(double altura, double peso, double idade, String sexo, String atividade) {
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		this.sexo = sexo;
		this.atividade = atividade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public double getIdade() {
		return idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;	
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setIdade(double idade) {
		this.idade = idade;
	}
	
	public double getData() {
		return this.idade;
	}
	
	public String calcularIMC() {
		
		//RETORNAR COM LIMITE DE 2 CASAS P�S VIRGULA
		return String.format("%.2f", this.peso / (this.altura * this.altura));
	}
	
	//CRIANDO VARIAVEIS DA FORMULA DE NCD
	public String calcularNCD () {
		double valorInicio;
		double valorFinal;
		double valorAtividade;
		
		//DESCOBRINDO CAIXA QUE O USUARIO MARCOU 
		if(sexo.equals("masculino")) {
			
			//FORMULA CASO O USUARIO SEJA DO SEXO MASCULINO
			if(idade<31) {
				valorInicio = 15.3;
				valorFinal = 679;
			}
			else if(idade<60) {
				valorInicio = 11.6;
				valorFinal = 879;
			}
			else {
				valorInicio = 13.5;
				valorFinal = 487;
			}
			
			if(atividade.equals(" Leve")){
				valorAtividade = 1.5;
			}
			
			else if(atividade.equals(" Moderada")) {
				valorAtividade = 1.8;
			}
			
			else {
				valorAtividade = 2.1;
			}
		}
		
		//FORMULA CASO O USUARIO SEJA DO SEXO FEMININO
		else {
			
			if(idade<31) {
				valorInicio = 14.7;
				valorFinal = 496;
			}
			else if(idade<60) {
				valorInicio = 8.7;
				valorFinal = 829;
			}
			else {
				valorInicio = 10.5;
				valorFinal = 596;
			}
			
			if(atividade.equals(" Leve")) {
				valorAtividade = 1.6;
			}
			
			else if(atividade.equals(" Moderada")) {
				valorAtividade = 1.6;
			}
			
			else {
				valorAtividade = 1.8;
			}
			
		}
		
		//RETORNAR COM LIMITE DE 2 CASAS P�S VIRGULA
		return String.format("%.2f", valorAtividade * (valorInicio * peso + valorFinal));
		
	}
}
