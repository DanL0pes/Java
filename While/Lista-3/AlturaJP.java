
public class AlturaJP {
	public static void main(String args[]) {
		double jAltura = 134, pAltura = 145;
		int i = 1;
		while(jAltura <= pAltura) {
			jAltura = jAltura + 2.5;
			pAltura = pAltura + 2.0;
			i++;
		}
		System.out.println("Jo�o passar� Pedro em "+ i +" anos");
	}
}
