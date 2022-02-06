package it.dipendenti.pojo;

import java.util.Date;


public class Movimenti {
	
	ContoCorrente contoCorrente;
	
	String tipoMovimrnto;
	
	String dataMovimento;
	
	Double importo;

	public Movimenti() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Movimenti(ContoCorrente contoCorrente, String tipoMovimrnto, String dataMovimento, Double importo) {
		super();
		this.contoCorrente = contoCorrente;
		this.tipoMovimrnto = tipoMovimrnto;
		this.dataMovimento = dataMovimento;
		this.importo = importo;
	}



	public ContoCorrente getContoCorrente() {
		return contoCorrente;
	}

	public void setContoCorrente(ContoCorrente contoCorrente) {
		this.contoCorrente = contoCorrente;
	}

	public String getTipoMovimrnto() {
		return tipoMovimrnto;
	}

	public void setTipoMovimrnto(String tipoMovimrnto) {
		this.tipoMovimrnto = tipoMovimrnto;
	}

	public String getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(String dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public Double getImporto() {
		return importo;
	}

	public void setImporto(Double importo) {
		this.importo = importo;
	}
		
}
