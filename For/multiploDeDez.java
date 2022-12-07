package multiploDeDez;

public class multiploDeDez {
	public static void main (String[]args) {
		double res, i;
		for(i=1; i<=100;i++) {
			res = i%10;			
			if(res == 0){
				System.out.println("Multiplo de 10!"+i);
			}
		}
	}
}
