import java.util.*;


public class Fibonacci {
	public int fiborecursivo(int n){
		if(n == 0){
			return 0;
		}else if( n == 1){
			return 1;
		}else{
			return fiborecursivo(n-1)+fiborecursivo(n-2);
		}
	}
	
	public int fibo(int n){
		int a = 0;
		int b = 1;
		int c = 1;
		
		if(n == 0){
			return 0;
		}else if( n == 1){
			return 1;	
		}else{
			for (int i = 2; i < n; i++) {
				a = b;
				b = c;
				c = a+b;
			}
			return c;
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		
		System.out.println(f.fiborecursivo(30));
		System.out.println(f.fibo(30));

		
	}
}
