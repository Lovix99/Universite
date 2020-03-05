package uni.uni;

public class Professeur extends Personne{

	
	public Professeur(String NomV,String PrenomV, int NumSecuV,int AncienV) {
		// TODO Auto-generated method stub
		Nom = NomV;
		Prenom = PrenomV;
		NumSecu = NumSecuV;
		Ancien = AncienV;
		Salaire = Ancien*50+1600;
		int ID = i;
		compteur();
		System.out.println("Etudiant n°"+ID+" créé");
		System.out.println("Salaire = "+Salaire+"€");
	}
	public static int i = 0;
	public int Ancien;
	public int Salaire;
	public static void compteur()
	{
		i = i+1;
		
	}
}
