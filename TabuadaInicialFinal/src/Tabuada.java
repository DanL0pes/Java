
public class Tabuada {
	public Tabuada(int numI,int numF) {
		while(numI <= numF) {
			System.out.println("Tabuada do "+numI);
			for(int i=1;i<=10;i++) {
				int res = numI * i;
				System.out.println(numI+" x "+i+" = "+res);
			}
			System.out.println("");
			numI++;
		}
	}
	public void close() {
		
	}
}
