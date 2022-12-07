import java.util.Scanner;
public class DiasMes {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		byte mes;
		System.out.println("Digite o número do mês:");
		mes=ler.nextByte();
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("O mês tem 31 dias.");
				break;
			case 2:
				System.out.println ("O mês tem 28 dias.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("O mês tem 30 dias.");
				break;
			default:
				System.out.println("Número inválido.");
		}
		ler.close();
	}

}
