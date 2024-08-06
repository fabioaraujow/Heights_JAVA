package entities;

public class PeopleData {
	private String nomes;
	private int idades;
	private double alturas, mediaAlturas, pMenores16;
	
	public PeopleData (String nome, int idade, double altura ) {
		this.nomes = nome;
		this.idades = idade;
		this.alturas = altura;
	}
	
	public PeopleData () {
		
	}
	
	public String getNomes() {
		return nomes;
	}
	
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	
	public int getIdades() {
		return idades;
	}

	public void setIdades(int idades) {
		this.idades = idades;
	}

	public double getAlturas() {
		return alturas;
	}

	public void setAlturas(double alturas) {
		this.alturas = alturas;
	}
	
	public double calculoMedia(double somaAlt, int n) {
		mediaAlturas = somaAlt / n;
		return mediaAlturas;
	}
	
	public double calculoPorcentagemMenores16(double quantidadeMenores16, int n) {
		pMenores16 = (quantidadeMenores16/n) * 100;
		return pMenores16;
	}
}
