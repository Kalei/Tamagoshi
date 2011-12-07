
public enum Humeur {
	
	Content(1),Pas_content(2),Triste(3);
	
	private int feel;
	
	Humeur(int n){
		feel = n;
	}
	
	public int getHumeur(){
		
		return feel;
	}
	public void setHumeur(int n){
		
		feel = n;
	}

}
