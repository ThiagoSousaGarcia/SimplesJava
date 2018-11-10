public class TrocaNum {
	public void trocar(int n, int i){
		System.out.println("Os originais são "+ " n = "+n+ " e "+ "i = "+i);
		int troca = n; 
		n = i;
		i = troca;
		System.out.println("Trocando temos: "+ " n = "+n+ " e "+ "i = "+i);
	}
	
	public static void main(String[] args) {
		TrocaNum t = new TrocaNum();
		
		t.trocar(20, 10);
		
	}
}


