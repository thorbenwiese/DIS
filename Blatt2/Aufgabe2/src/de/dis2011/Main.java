package de.dis2011;

import de.dis2011.data.Makler;
import de.dis2011.data.Estate_Agent;

/**
 * Hauptklasse
 */
public class Main {
	/**
	 * Startet die Anwendung
	 */
	public static void main(String[] args) {
		showMainMenu();
	}
	
	/**
	 * Zeigt das Hauptmenü
	 */
	public static void showMainMenu() {
		//Menüoptionen
		final int MENU_MAKLER = 0;
		final int MENU_ESTATE_AGENT = 1;
		final int QUIT = 2;
		
		//Erzeuge Menü
		Menu mainMenu = new Menu("Hauptmenü");
		mainMenu.addEntry("Makler-Verwaltung", MENU_MAKLER);
		mainMenu.addEntry("Estate-Agent Verwaltung", MENU_ESTATE_AGENT);
		mainMenu.addEntry("Beenden", QUIT);
		
		//Verarbeite Eingabe
		while(true) {
			int response = mainMenu.show();
			
			switch(response) {
				case MENU_MAKLER:
					showMaklerMenu();
					break;
				case MENU_ESTATE_AGENT:
					showEstateAgent();
					break;
				case QUIT:
					return;
			}
		}
	}
	
	/**
	 * Zeigt die Maklerverwaltung
	 */
	public static void showMaklerMenu() {
		//Menüoptionen
		final int NEW_MAKLER = 0;
		final int BACK = 1;
		
		//Maklerverwaltungsmenü
		Menu maklerMenu = new Menu("Makler-Verwaltung");
		maklerMenu.addEntry("Neuer Makler", NEW_MAKLER);
		maklerMenu.addEntry("Zurück zum Hauptmenü", BACK);
		
		//Verarbeite Eingabe
		while(true) {
			int response = maklerMenu.show();
			
			switch(response) {
				case NEW_MAKLER:
					newMakler();
					break;
				case BACK:
					return;
			}
		}
	}
	
	/**
	 * Zeigt die Estate-Agent Verwaltung
	 */
	public static void showEstateAgent() {
		//Menüoptionen
		final int NEW_ESTATE_AGENT = 0;
		final int CHANGE_ESTATE_AGENT = 1;
		final int DELETE_ESTATE_AGENT = 2;
		final int BACK = 3;
		
		//Maklerverwaltungsmenü
		Menu maklerMenu = new Menu("Estate-Agent-Verwaltung");
		maklerMenu.addEntry("Neuer Estate Agent", NEW_ESTATE_AGENT);
		maklerMenu.addEntry("Estate Agent bearbeiten", NEW_ESTATE_AGENT);
		maklerMenu.addEntry("Estate Agent löschen", NEW_ESTATE_AGENT);
		maklerMenu.addEntry("Zurück zum Hauptmenü", BACK);
		
		//Verarbeite Eingabe
		while(true) {
			int response = maklerMenu.show();
			
			switch(response) {
				case NEW_ESTATE_AGENT:
					newEstateAgent();
					break;
				case CHANGE_ESTATE_AGENT:
					changeEstateAgent();
					break;
				case DELETE_ESTATE_AGENT:
					deleteEstateAgent();
					break;
				case BACK:
					return;
			}
		}
	}
	
	/**
	 * Legt einen neuen Makler an, nachdem der Benutzer
	 * die entprechenden Daten eingegeben hat.
	 */
	public static void newMakler() {
		Makler m = new Makler();
		
		m.setName(FormUtil.readString("Name"));
		m.setAddress(FormUtil.readString("Adresse"));
		m.setLogin(FormUtil.readString("Login"));
		m.setPassword(FormUtil.readString("Passwort"));
		m.save();
		
		System.out.println("Makler mit der ID "+m.getId()+" wurde erzeugt.");
	}
	
	/**
	 * Legt einen neuen Estate-Agent an, nachdem der Benutzer
	 * die entprechenden Daten eingegeben hat.
	 */
	public static void newEstateAgent() {
		Estate_Agent m = new Estate_Agent();
		
		m.setName(FormUtil.readString("Name"));
		m.setAddress(FormUtil.readString("Adresse"));
		m.setLogin(FormUtil.readString("Login"));
		m.setPassword(FormUtil.readString("Passwort"));
		m.save();
		
		System.out.println("Estate Agent mit der ID "+m.getId()+" wurde erzeugt.");
	}
	
	public static void changeEstateAgent() {
		
		String name = FormUtil.readString("Name");
		String address = FormUtil.readString("Adresse");
		String login = FormUtil.readString("Login");
		String password = FormUtil.readString("Passwort");
		
		//Estate_Agent m = 
		//m.save();
		
		//System.out.println("Estate Agent mit der ID "+m.getId()+" wurde erzeugt.");
	}
	
	public static void deleteEstateAgent() {
		Estate_Agent m = new Estate_Agent();
		
		m.setName(FormUtil.readString("Name"));
		m.setAddress(FormUtil.readString("Adresse"));
		m.setLogin(FormUtil.readString("Login"));
		m.setPassword(FormUtil.readString("Passwort"));
		m.save();
		
		System.out.println("Estate Agent mit der ID "+m.getId()+" wurde erzeugt.");
	}
}
