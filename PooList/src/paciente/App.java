package paciente;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Paciente p = new Paciente();
		p.setNome(in.next());
		p.setIdade(in.nextInt());
		p.setPeso(in.nextDouble());
		p.setAltura(in.nextDouble());
		p.setEmail(in.next());
		System.out.println(p.getNome()+", "+p.getIdade()+", "+ p.getPeso()+", "+p.getAltura()+", "+p.getEmail()+".");
		in.close();
	}
}
