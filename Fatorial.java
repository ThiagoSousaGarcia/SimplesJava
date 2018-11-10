import java.util.*;

public class Fatorial {

	public int fatorecursivo(int n){
		if(n>1){
			return n*fatorecursivo(n-1);
		}
		return 1;
	}
	
	public int fatorial(int n){
		int a = 1;
		int b = 1;
		
		for(int i = 2;i<=n;i++){
			b = a*i;
			a = b;
		}
		return a;
		
	}
	
	
	public static void main(String[] args) {
		Fatorial fat = new Fatorial();
		
		System.out.println(fat.fatorecursivo(5));
		System.out.println("-----------");
		System.out.println(fat.fatorial(5));

	}
}

