import java.util.*;


public class Fibonacci {

	public int fiborecursivo(int n){
		if(n>1){
			return n*fiborecursivo(n-1);
		}
		return 1;
	}
	
	public int fibon(int n){
		int a = 1;
		int b = 1;
		
		for(int i = 2;i<=n;i++){
			b = a*i;
			a = b;
		}
		return a;
		
	}
	
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		
		System.out.println(fib.fiborecursivo(5));
		System.out.println("-----------");
		System.out.println(fib.fibon(5));

	}
}
