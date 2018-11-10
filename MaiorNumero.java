
public class MaiorNumero {
	public int maior(int n, int i){
		if(n>i){
			return n;
		}else{
			return i;
		}
	}
	
	public static void main(String[] args) {
		MaiorNumero maior = new MaiorNumero();
		
		System.out.println(maior.maior(100, 20));
	}
}
