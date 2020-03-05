package uni.uni;

public class Etudiant extends Personne {

	
	public Etudiant(String NomV,String PrenomV, int NumSecuV,int AnneeEtudeV) {
		// TODO Auto-generated method stub
		Nom = NomV;
		Prenom = PrenomV;
		NumSecu = NumSecuV;
		AnneeEtude = AnneeEtudeV;
		fraisInscrip = AnneeEtude*150;
		int ID = i;
		compteur();
		System.out.println("Etudiant n°"+ID+" créé");
		System.out.println("Frais d'inscription = "+fraisInscrip+"€");
	}
	public static int i = 0;
	public int AnneeEtude;
	public int fraisInscrip;
	public static void compteur()
	{
		i = i+1;
		
	}
}
