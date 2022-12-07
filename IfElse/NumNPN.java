import java.util.*;
public class NumNPN {
	public static void main (String []args) {
		Scanner ler= new Scanner (System.in);
		short num;
		System.out.println ("Digite um número:");
		num=ler.nextShort();
		if (num==0) {
			System.out.println("O número é neutro.");
		}else if(num<0) {
			System.out.println("O número é negativo.");
		}else {
			System.out.println("O número é positivo.");
		}
		ler.close();
	}

}
