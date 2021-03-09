package it.polito.tdp.parole;
import java.util.*;
import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.ParoleArrayList;

import java.time.LocalDate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLController {
	
	Parole elenco ;
    String p = "";
  

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    @FXML
    private Button btnCancella;

    @FXML
    private TextArea txtTime;
  
    @FXML
    void doInsert(ActionEvent event) {
     
    	double start = System.nanoTime();
    	this.txtTime.setText("");
    	
    	  String lista= "";
    	try {
    	 p = txtParola.getText();
    	}
    	catch(Exception e) {
    		System.out.println("Devi inserire una parola!");
    	}
    	
    	elenco.addParola(p);
    	
    	for(String s : elenco.getElenco()) {
    		 lista += s + "\n";	
    	}
    	
    	this.txtParola.setText("");
    	
    	this.txtResult.setText(lista);
    	
    	double stop = System.nanoTime();
    	
    	this.txtTime.setText("Tempo di esecuzione (parola '" + p + "'): " + (stop-start)+ " nanosecondi");
    	
    	
    }

    @FXML
    void doReset(ActionEvent event) {

    	this.txtTime.setText("");
    	double start = System.nanoTime();
    	
    	elenco.reset();
    	
    	this.txtResult.setText("");

    	double stop = System.nanoTime();
    	
    	
    	this.txtTime.setText("Tempo per RESET : " + (stop-start)+ " nanosecondi");
    	
    	
    }

    @FXML
    void doCancella(ActionEvent event) {
  
    	this.txtTime.setText("");
    	double start = System.nanoTime();
    	
    	String lista = "";
    	
    	this.txtParola.setText("");
    	String daCancellare = this.txtResult.getSelectedText();
    	elenco.cancella(daCancellare);
    	this.txtResult.clear();
    	for(String s: elenco.getElenco()) {
    		
    			lista += s + "\n";
    		
    	}    	
    	this.txtResult.setText(lista);
    	
    	double stop = System.nanoTime();
    	
    	this.txtTime.setText("Tempo per cancellare (parola " + daCancellare+ "'): " + (stop-start)+ " nanosecondi");
    	
    }
    
    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }

	@Override
	public String toString() {
		return this.p + "\n";
	}

    
    
}
