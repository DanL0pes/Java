package Somatoria;

public class POO {
	
	int i;
	int va = 0;
	
	public void somatoria() {
		for (i = 0; i <= 100; i++) {
			va = va + i;
		}
		System.out.println("Valor final:" + va);
	}

}
