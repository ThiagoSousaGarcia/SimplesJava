import java.util.*;

public class Primo {
	
	public boolean primo(int n){
		int cont = 0;
		for (int i = 1; i <= n; i++) {
			if(n%i == 0){
				cont = cont + 1;
			}
		}
		if (cont == 2){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void imprimirprimos(int n){
		for (int i = 1; i <= n; i++) {
			if (primo(i)){
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Primo primo = new Primo();
		
		System.out.println("-N Primos");
		primo.imprimirprimos(99);
	}
}

