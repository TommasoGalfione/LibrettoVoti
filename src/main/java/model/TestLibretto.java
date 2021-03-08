package model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	public static void main(String[] args) {
		
		System.out.println("test metodi libretto");
		
		Libretto libretto =new Libretto();
		
		Voto voto1= new Voto("Analisi 1",30, LocalDate.of(2019, 2, 15));
		
		libretto.add(voto1);
		libretto.add(new Voto("chimica",25,LocalDate.of(2019, 3, 19)));
		libretto.add(new Voto("Fisica 1",28,LocalDate.of(2019, 2, 19)));
		libretto.add(new Voto("informatica",24,LocalDate.of(2019, 9, 19)));
		
		System.out.println(libretto);
		List<Voto> venticinque= libretto.listaVotiUguali(25);
		System.out.println(venticinque);
		
		Libretto librettoVenticinque =libretto.votiUguali(25);
		System.out.println(librettoVenticinque);
	}

}
