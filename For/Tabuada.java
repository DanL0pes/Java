import java.util.*;
public class Tabuada {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num, res, i = 1;
		System.out.println("Digite o número que deseja:");
		num = in.nextInt();
		for (i=1; <= 10; i++) {
			res = num * i;
			System.out.println(num+"x"+i+"="+res);
		}
		in.close();
	}
}
