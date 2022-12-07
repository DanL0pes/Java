
public class Fibonacci {
	public static void main(String args[]) {
		int ante=0, suce=1, i, res=1;
		for(i=1;i<=10;i++) {
			System.out.println(res);
			res = ante + suce;
			ante = suce;
			suce = res;
		}
	}
}
