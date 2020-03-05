package uni.uni;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant etudiant = new Etudiant("RENARD","Lou-Ann",02,3);
		Etudiant etudiant2 = new Etudiant("LEMAIRE","Alexandre",01,1);
		Professeur prof = new Professeur("RENARD","Lou-Ann",02,1);
		Professeur prof2 = new Professeur("LEMAIRE","Alexandre",01,40);
		
		if (etudiant.fraisInscrip<etudiant2.fraisInscrip)
		{
			System.out.println("L'�tudiant "+etudiant2.Prenom+" "+etudiant2.Nom+ " paie plus de frais d'inscription ("+etudiant2.fraisInscrip+") que "+etudiant.Prenom+" "+etudiant.Nom);
		}
		else
		{
			System.out.println("L'�tudiant "+etudiant.Prenom+" "+etudiant.Nom+ " paie plus de frais d'inscription ("+etudiant.fraisInscrip+") que "+etudiant2.Prenom+" "+etudiant2.Nom);
		}
	}

}
