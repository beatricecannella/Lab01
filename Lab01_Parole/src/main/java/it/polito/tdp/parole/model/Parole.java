package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.*;
import java.util.List;

import it.polito.tdp.parole.ComparatoreParoleOrdineAlfabetico;

public class Parole {
	String parola;	
	LinkedList <String> parole;
//	ArrayList <String> parole;
	
	public Parole() {
		
		this.parola = parola;
		parole = new LinkedList<String>();
	}

	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		LinkedList <String> elenco = new LinkedList<String>(parole);
    	 Collections.sort(elenco, new ComparatoreParoleOrdineAlfabetico());
    	
    	 return elenco;
	}
	
	public void reset() {
		parole.removeAll(parole);
	}

	public void cancella(String s) {
		parole.remove(s);

	}
}
