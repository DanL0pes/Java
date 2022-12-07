import java.util.*;
public class Tabuada {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num, res, i = 1;
		System.out.println("Digite o número que deseja:");
		num = in.nextInt();
		while (i <= 10) {
			res = num * i;
			System.out.println(num+"x"+i+"="+res);
			i++;
		}
		in.close();
	}
}
