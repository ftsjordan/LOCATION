
import java.util.Scanner;

public class Propriete {
	Scanner clavier = new Scanner(System.in);
	
	protected int IdPropriete;
	protected boolean statut=false;
	protected Type_Propriete type;
	protected DataBase BD;
	protected Propriete [] tableau;
	protected Propriete [] tableau1;
	protected float prix;
	protected String description;
	
	/*METHODE SUR LES PROPRIETES
	 * @ajouterPropriete()
	 * @supprimerPropriete(IdPropriete)
	 * @modifierPropriete()
	 * @afficherPropriete()
	 * @consulterListePropriete()
	 * 		CETTE METHODE ENREGISTRE LES DESCRIPTION DE CHAQUE PROPRIETE
	 * @decrire()
	 * */	
	public void ajouterPropriete()
	{  
		int choix=0;
		System.out.println("-----------------------------SYSTEM D'AJOUT DE PROPRIETE-----------------------------------\n ");
		System.out.print("COMBIEN DE PROPRIETE VOULEZ VOUS AJOUTER : ");
		int n=clavier.nextInt();
		System.out.print("\n");
		tableau= new Propriete[n];
		System.out.println("VEILLEZ ENTRER UNIQUEMENT LE NUMERO DE VOTRE CHOIX SVP");
		System.out.println("");
		for(int i=0;i<tableau.length;i++) 
		{
			System.out.println("PROPRIETE :"+i+"\t1-MAISON\t2-BOUTIQUE\t0-ANNULER");
			System.out.print("NUMERO DE CHOIX : ");
			choix = clavier.nextInt();
			if(choix==1) 
			{
				tableau[i]=new Maison();
				this.IdPropriete=i;
				tableau[i].statut=false;
			}
			else if(choix==2)
			{
				tableau[i]=new Boutique();
				this.IdPropriete=i;
				tableau[i].statut=false;
			}
			else if (choix==0) {System.out.println("OPERATION ANNULEE");
			break;
			}
			else 
			{
				System.out.println("vous n avez aucune propriete");
				tableau[i].statut=false;
			}
			
			
	    }
		
	}
	public void decrire()
	{
		
		System.out.println("entrez le prix de location");
		this.prix=clavier.nextFloat();	
		this.description=clavier.nextLine();
		System.out.println(this.description+"\n\tPRIX : "+this.prix);
	}
	
//assignation de location
	
	public Propriete [] assigner(Locataire loc,int id_Propriete) {
		
		//rechercher l'id de la propriete a assigner
		
		System.out.println("vous essayez d'attribuer la propriete PROP"+id_Propriete);
		for(int i=0;i<this.tableau.length;i++)
		{
			if(this.tableau[i].IdPropriete==id_Propriete)
			{
				
				this.tableau[i].statut=true;
			}
			else if(this.tableau[i].IdPropriete!=id_Propriete)
			{
				this.tableau[i].statut=false;
			}
			
		}
	//	System.out.println("Mr/Mme: "+loc.getNom()+" est desormais locataire de la propriete d'ID PROP"+id_Propriete);
		return this.tableau;
			
			
			/*
			 * if(this.statut==true && this.tableau[i].IdPropriete==id) {
				System.out.println("la propriete: PROP"+this.tableau[i].IdPropriete+" est deja occupé par: "+loc.getNom());
				
				}
				else if(this.statut==false && this.tableau[i].IdPropriete==id)
				{
					System.out.println("Mr: "+loc.getNom()+" est desormais locataire de la propriete d'ID PROP"+this.tableau[i].IdPropriete);
					
					this.statut = true;
				}
				else
				{
					System.out.println("nous ne trouvons pas de propriete a assigner");
					
					this.tableau[i].statut = true;
				}
		*/
	
			
		
		
		
	}
//verifier les proprietes libres
	
	
	public Propriete[] proprieteLibre()
	{
	for(int i=0;i<this.tableau.length;i++)
	{
				if(this.tableau[i].statut==true) 
				{	
						this.tableau1[i].IdPropriete= this.tableau[i].IdPropriete;
				}
				
			
				else
					
					{
						System.out.println("vous n'avez aucune propriete de libre");
						return null;
					}
	}
	return tableau1;
			
	}

	

	
	public int getIdPropriete()
	{
		return this.IdPropriete;
	}

	
//afficher la liste de propriete disponible et non disponible
	
	
	public void afficherProriete()
	{
		for(int i=0;i<this.tableau.length;i++)
		{
			this.IdPropriete=i;
			
			if(this.tableau[i].statut==true)
			{
				
				System.out.println("PROPRIETE "+i+"  "+this.tableau[i] +" \tID: PROP"+this.IdPropriete +" \tSTATUT:occupé ");
			}
			else
			{
				System.out.println("PROPRIETE "+i+"  "+this.tableau[i] +" \tID: PROP"+this.IdPropriete +" \tSTATUT:libre ");
			}
			
		}
	}
 
//setStatut
	
	
	
	
}
	
