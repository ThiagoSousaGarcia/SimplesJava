public class ComparaNumero {
	public void comparar (int n, int i){
		if(i == n){ 
			System.out.println("Os números são iguais");
		}else if(i>n){
			System.out.println("O maior é "+ i +" E o menor é "+ n);
		}else{
			System.out.println("O maior é "+ n +" E o menor é "+ i);
		}
	}
	
	public static void main(String[] args) {
		ComparaNumero c = new ComparaNumero();
		
		c.comparar(10,20);
		c.comparar(10,10);
		c.comparar(25,20);
	}
}