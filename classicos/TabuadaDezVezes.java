
public class TabuadaDezVezes {
	public static void main(String args[]) {
		int i, res, n;
		for(n=1; n<=10; n++) {
			System.out.println("Tabuada do "+n);
			for(i=1;i<=10;i++) {
				res = i * n;
				System.out.println(i+"x"+n+"="+res);
			}
			System.out.println("");
		}	
	}
}
