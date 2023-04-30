package it.polito.tdp.anagrammi.test;


import it.polito.tdp.anagrammi.DAO.AnagrammiDAO;
import it.polito.tdp.anagrammi.model.*;

public class test {
	
	private void start() {
		
		//--------------Test sul DAO-------------------------------------
		
		AnagrammiDAO anagrammaDAO = new AnagrammiDAO();
		
		if(anagrammaDAO.isCorrect("ciao")) {
			System.out.println("ciao è nel dizionario");
		}
		else {
			System.out.println("ERRORE");
		}
		
		if(anagrammaDAO.isCorrect("coia")) {
			System.out.println("ERRORE");
		}
		else {
			System.out.println("coia non è nel dizionario");
		}
		
		//---------------Test sul modello---------------------------------
		AnagrammiModel mod = new AnagrammiModel();

	
		System.out.println(mod.calcolaAnagrammi("eta"));
		System.out.println(mod.calcolaAnagrammi("ere"));
		
		
		return;
	}
	
	public static void main(String[] args) {
        test testI = new test();
        testI.start();
    }
	

}
