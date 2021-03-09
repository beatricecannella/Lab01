package it.polito.tdp.parole.model;
import it.polito.tdp.parole.ComparatoreParoleOrdineAlfabetico;
import java.util.ArrayList;
import java.util.Collections;

public class ParoleArrayList {

		String parola;	
		ArrayList <String> parole;
	  
		
		public ParoleArrayList() {
			
			this.parola = parola;
			parole = new ArrayList<String>();
		}

		public void addParola(String p) {
			parole.add(p);
		}
		
		public ArrayList<String> getElenco() {
			ArrayList <String> elenco = new ArrayList<String>(parole);
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
