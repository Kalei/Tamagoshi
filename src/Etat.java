
public enum Etat {
	
	Vivant(1),Malade(2),Mort(3),Dort(4),Eveille(5);//on �num�re tous les �tat du tamagoshi
	
	private int etat;
	
	//Constructeur//
	Etat(int n){
		etat = n;
	}
	
	//Accesseur d'etat
	public int getEtat(){
		return etat;
	}
}
