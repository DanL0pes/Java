package prjAreaCircunferencia;
import java.util.Scanner;
public class AreaCircunferencia {
	public static void main (String[]args) {
		double raio, VALOR_PI, area;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite o raio da circunferência:");
		raio=ler.nextDouble();
		VALOR_PI=3.14;
		area=VALOR_PI*raio*raio;
		System.out.println ("A área da circunferência é "+area+".");
		ler.close();
	}

}
