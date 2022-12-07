import java.util.*;
public class FaixaEreditaria {
	public static void main(String args[]) {
		int i, idade;
		double p15, p30, p45, p60, p65, i15=0, i30=0, i45=0, i60=0, i65=0;
		Scanner in = new Scanner(System.in);
		for(i=0; i<15; i++) {
			System.out.println("Digite a idade da "+(i+1)+"° pessoa:");
			idade = in.nextInt();
			if(idade<=15) {
				i15++;
			}else if(idade<=30) {
				i30++;
			}else if(idade<=45) {
				i45++;
			}else if(idade<=60) {
				i60++;
			}else if(idade>60) {
				i65++;
			}
		}
		p15 = (i15/i)*100;
		p30 = (i30/i)*100;
		p45 = (i45/i)*100;
		p60 = (i60/i)*100;
		p65 = (i65/i)*100;
		System.out.println("Há "+i15+" pessoas menores ou iguais à 15 anos, com a porcentagem de "+p15+"%");
		System.out.println("Há "+i30+" pessoas menores ou iguais à 30 anos, com a porcentagem de "+p30+"%");
		System.out.println("Há "+i45+" pessoas menores ou iguais à 45 anos, com a porcentagem de "+p45+"%");
		System.out.println("Há "+i60+" pessoas menores ou iguais à 60 anos, com a porcentagem de "+p60+"%");
		System.out.println("Há "+i65+" pessoas maiores de 60 anos, com a porcentagem de "+p65+"%");
	}
}
