package it.polito.tdp.parole;
import java.util.*;
import it.polito.tdp.parole.model.Parole;

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
    String lista= "";

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
    void doInsert(ActionEvent event) {
    	try {
    	 p = txtParola.getText();
    	
    	}
    	catch(Exception e) {
    		System.out.println("Devi inserire una parola!");
    	}
    	
    	elenco.addParola(p);
    	elenco.getElenco();
    	
    	 
    	for(String s : elenco.getElenco()) {
    		/*if(elenco.getElenco().size()==0) {
    			lista = "";
    		}
    		else {*/
    		 lista += s + "\n";	
    		
    	}
    	 
    	this.txtResult.setText(lista);
    	
    	
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }

	@Override
	public String toString() {
		return this.p + "\n";
	}

    
    
}
