import java.util.*;
public class GrausFParaC {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		byte f,c;
		System.out.println("Digite a temperartura em Fahrenheit para converter em graus Celcius:");
		f=ler.nextByte();
		c=(byte) ((f-32)*5/9);
		System.out.println("A temperatura em graus Celcius é de "+c+"°.");
		if (c<15) {
			System.out.println ("Frio.");
		}else if (c<22) {
			System.out.println("Ameno.");
		}else {
			System.out.println("Calor.");
		}
		ler.close();
	}

}
