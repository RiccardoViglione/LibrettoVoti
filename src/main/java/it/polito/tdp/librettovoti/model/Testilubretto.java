package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class Testilubretto {
	public static void main(String[] args) {
System.out.println("Test metodi libretto");
	Libretto libretto=new Libretto();
	Voto voto1= new Voto("Analisi 1",30,LocalDate.of(2019,2,15));
	libretto.add(voto1);
	libretto.add(new Voto ("fisica 1 ",28,LocalDate.of(2019,7,15)));
	libretto.add(new Voto ("informatica 1 ",24,LocalDate.of(2019,9,15)));

	System.out.println(libretto);
}
}