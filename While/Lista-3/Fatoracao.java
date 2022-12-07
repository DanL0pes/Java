import java.util.*;
public class Fatoracao {
	public static void main (String args[]) {
		int num, fat;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o número desejado:");
		num = in.nextInt();
		fat = num;
		while (num>1) {
			System.out.println(num+ "x ");
			fat = fat * (num - 1);
			num = num - 1;
		}
		System.out.println("= " +fat);
		in.close();
	}
}	