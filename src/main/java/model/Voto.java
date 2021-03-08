package model;

import java.time.LocalDate;

// POJO -Plain Old Java Object
// Java Bean
// Semplice contenitore di dati -- non ha "logica"

/**
 * Memorizza risultato di un esame singolo
 * @author tommy
 *
 */

public class Voto {
	private String nomeCorso;
	private int voto; //come lo rappresento 30L
	private LocalDate data; //data svolgimento esame
	
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nomeCorso + " superato con " + voto + ", il " + data ;
	}
	
	

}
