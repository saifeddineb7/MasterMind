package mastermind;

public class Joueur {
	private String identifiant;
	private String mdp;
	//Le nom(l'adresse) de l'image du joueur
	private String avatar;
	private int malus;
	
	// Constructeur par paramètre
	public Joueur( String identifiant, String mdp, String avatar, int malus ){
		this.identifiant = identifiant;
		this.mdp = mdp;
		this.avatar = avatar;
		this.malus = malus;
	}
	
	
	//Methodes get et set
	
	public String getIdentifiant(){
		return this.identifiant;
	}
	
	public void setIdentifiant( String identifiant ){
		this.identifiant = identifiant;
	}
	
	public String getMDP(){
		return this.mdp;
	}
	
	public void setMDP( String mdp ){
		this.mdp = mdp;
	}
	
	public String getAvatar(){
		return this.avatar;
	}
	
	public void setAvatar( String avatar ){
		this.avatar = avatar;
	}
	
	public int getMalus(){
		return this.malus;
	}
	
	public void setMalus( int malus ){
		this.malus = malus;
	}
	
	//Fin des methodes get set
	
	

}
