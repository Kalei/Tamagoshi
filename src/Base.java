
public enum Base {
	
	plage(1),mars(2),montagne(3);
	
	private int bg;//background
	
	Base(int n){
		bg = n;
	}
	
	public int getBase(){
		
		return bg;
	}

}
