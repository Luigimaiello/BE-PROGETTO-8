package it.dipendenti.pojo;

public class ContoCorrente {
	
	String nome;
	String cognome;
	int numeroConto;
	Double saldoConto;
		
	public ContoCorrente() {
		super();
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}
	public Double getSaldoConto() {
		return saldoConto;
	}
	public void setSaldoConto(Double saldoConto) {
		this.saldoConto = saldoConto;
	}
	
	
	

}
