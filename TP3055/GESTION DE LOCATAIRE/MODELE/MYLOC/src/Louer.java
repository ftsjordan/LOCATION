
import java.util.Date;

public class Louer {

	
	private Locataire locataire;
	private Propriete propriete;
	private Date dateLocation;
	
	

	 
	/*METHODES SUR LA LOCATION
	 * ajouterLocation(pLocataire,pPropriete,dateLocation);
	 * quitterLocation(locataire,propriete);
	 * getDateLocation();
	 * setDateLocation(Date dateLocation);
	 * afficherLocation();
	 */
	public void ajouterLocation(Locataire locataire,Propriete propriete,Date dateLocation)
	{
		this.locataire=locataire;
		this.propriete=propriete;
		this.dateLocation=dateLocation;
	}
	public void quitterLocation()
	{
		this.locataire=null;
		this.propriete=null;
		this.dateLocation=null;
	}
	public Date getDateLocation() {
		return dateLocation;
	}
	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}
	public void afficherLocation(Locataire locataire,Propriete propriete,Date dateLocation)
	{
		this.locataire=locataire;
		this.propriete=propriete;
		this.dateLocation=dateLocation;
		System.out.println("NOM : "+this.locataire.getName()+"\tID PROPRIETE :"+"PROP"+"\t DATE DE DEBUT LOCATION :");
	}
	
}
	

