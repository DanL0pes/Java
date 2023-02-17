import java.util.*;
public class InversorTresAlgarismosCorrigido {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int n, i = 0, i1, i2, i3;
		System.out.println("Digite o número:");
		n = in.nextInt();
		i3 = n/100;
		i2 = n%100/10;
		i1 = n%100%10;
		i = i1*100+i2*10+i3;
		System.out.println(i);
		in.close();
	}
}
 	