
import java.util.Date;
import java.util.Scanner;

public class Locataire {
Scanner clavier = new Scanner(System.in);
	private Date dateNaissance;
	private String name;
	private String lastName;
	private String metier;
	private String mail;
	private String informatioSuplementaire;
	private int telephone;
	private int numeroCNI;
	

/*METHODE SUR LES LOCATAIRES
 * 
 * CONSTRUCTEUR particulier D'UN LOCATAIRE
 * ajouterLocataire();
 * 
 * DESTRUCTION D'UN LOCATAIRE
 * supprimerLocataire();
 * 
 * CHANGER DE INFORMATION SUR LE LOCATAIRE
 * modifierLocataire();
 * 
 * AFFICHER LA LISTE DE TOUT LES LOCATAIRE
 * listeLocataire();
 * 
 * AFFICHER LOCATAIRE
 * 
 * GETTER FOR NAME
 * getName();
 */
	
	public void ajouterLocataire()
	{
		System.out.println("-----------------------------------SYSTEM DE RECEUIL D'INFORMATION SUR LE LOCATAIRE------------------------------");
		System.out.print("\n ");
		System.out.print("\n ");
		System.out.print("NOM : ");
		this.name=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("PRENOM : ");
		this.lastName=clavier.nextLine();
		//System.out.print("\n ");
		//System.out.print("DATE DE NAISSANCE : ");
		//this.dateNaissance=clavier.Date()
		System.out.print("\n ");;
		System.out.print("METIER : ");
		this.metier=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("INFORMATION SUPPLEMENTAIRE : ");
		this.informatioSuplementaire=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("MAIL : ");
		this.mail=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("CNI : ");
		this.numeroCNI=clavier.nextInt();
		System.out.print("\n ");
		System.out.print("TELEPHONE: ");
		this.telephone=clavier.nextInt();
		System.out.print("\n ");
		
		
		
		
	}
	public void supprimerLocation()
	{
		this.name=null;
		this.lastName=null;
		this.mail=null;
		this.metier=null;
		this.informatioSuplementaire=null;
		this.numeroCNI=0;
		this.telephone=0;
		
	}
	public void modifierLocataire()
	{
		
	}
	public void listeLocataire()
	{
		
	}
	public void afficheLocataire()

	{
		System.out.println("-----------------------------------SYSTEM DE RECEUIL D'INFORMATION SUR LE LOCATAIRE------------------------------");
		System.out.print("\n ");
		System.out.print("\n ");
		System.out.print("NOM : "+this.name);
		
		System.out.print("\n ");
		System.out.print("PRENOM : "+this.lastName);
		
		//System.out.print("\n ");
		//System.out.print("DATE DE NAISSANCE : ");
	
		System.out.print("\n ");;
		System.out.print("METIER : "+this.metier);
		
		System.out.print("\n ");
		System.out.print("INFORMATION SUPPLEMENTAIRE : "+this.informatioSuplementaire);
		
		System.out.print("\n ");
		System.out.print("MAIL : "+this.mail);
		
		System.out.print("\n ");
		System.out.print("CNI : "+this.numeroCNI);
		
		System.out.print("\n ");
		System.out.print("TELEPHONE: "+this.telephone);
		
		System.out.print("\n ");
		
		
		
	}
	public String getName()
	{
		return this.name;
	}
}
	