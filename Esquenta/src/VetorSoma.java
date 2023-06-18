import java.util.*;
public class VetorSoma {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], c[], i;
		a = new int [10];
		b = new int [10];
		c = new int [10];
		for (i=0 ;i<=9; i++) {
			System.out.println("Informe o "+(i+1)+"° valor");
			a[i]= in.nextInt();		
		}
		
		for (i=0 ;i<=9; i++) {
			System.out.println("Informe o "+(i+1)+"° valor:");
			b[i]= in.nextInt();		
		}
	
		for (i=0 ;i<=9; i++) {
			c[i]= a[i]+b[i];		
		}
		for (i=0 ;i<=9; i++) {
			System.out.print(a[i]+" ");		
		}
		System.out.println();
		for (i=0 ;i<=9; i++) {
			System.out.print(b[i]+" ");		
		}
		System.out.println();
		for (i=0 ;i<=9; i++) {
			System.out.print(c[i]+" ");		
		}
		in.close();
	}
}
