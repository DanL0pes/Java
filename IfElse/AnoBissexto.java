import java.util.*;
public class AnoBissexto {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		short anoNascto, anoBissexto;
		System.out.println ("Digite seu ano de nascimento:");
		anoNascto=ler.nextShort();
		anoBissexto=(short) (anoNascto%4);
		if (anoBissexto==0) {
			System.out.println ("O ano é bissexto.");
		}else {
			System.out.println ("O ano não é bissexto.");
		}
		ler.close();
	}

}
