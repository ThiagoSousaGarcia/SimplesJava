public class NumeroDecrescente {
	public void ordemdecrescente(int n){
		
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
			
			
		
	}
	
	public static void main(String[] args) {
		NumeroDecrescente n = new NumeroDecrescente();
		
		n.ordemdecrescente(20);
	}
}
