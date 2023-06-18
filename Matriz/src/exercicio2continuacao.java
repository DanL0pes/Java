import java.util.Scanner;
public class exercicio2continuacao {
	public static void main(String[]args) {
		String matriz[][] = new String[3][3];
		int x=0, o=0, i, j, erro=0;
		String ganhador = null;
		Scanner in = new Scanner (System.in);
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				matriz[i][j] = "-";
			}
		}
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
		
		do {
			do {
				System.out.println("Jogador X");
				System.out.println("Digite a linha que quer jogar.");
				i = in.nextInt()-1;
				System.out.println("Digite a coluna que quer jogar.");
				j = in.nextInt()-1;
				if(matriz[i][j].equals("-")) {
					matriz[i][j] = "X";
					erro=0;
				} else {
					erro=1;
					System.out.println("Jogada Inválida, Jogue novamente...");
				}
				for(i=0;i<=2;i++) {
					for(j=0;j<=2;j++) {
						System.out.print(matriz[i][j]+ " ");
					}
					System.out.println();
				}
			}while(erro == 1);
			
			for(i=0;i<=2;i++) {
				for(j=0;j<=2;j++) {
					if(matriz[i][j].equals("X")) {
						x= x+1;
						if(x==3) {
							ganhador= "X";
						}
						if(j==2) {
							x=0;
							o=0;
						}
					}
					
					else if(matriz[i][j].equals("O")) {
						o= o+1;
						if(o==3) {
							ganhador= "O";	
						}
					}
				}
				o=0;
				x=0;
			}
			for(j=0;j<=2;j++) {
				for(i=0;i<=2;i++) {
					if(matriz[i][j].equals("X")) {
						x= x+1;
						if(x==3) {
							ganhador= "X";
						}
					}
					
					else if(matriz[i][j].equals("O")) {
						o= o+1;
						if(o==3) {
							ganhador= "O";	
						}
					}
				}
				o=0;
				x=0;
			}
			if(ganhador == null) {
				do {
					System.out.println("Jogador O");
					System.out.println("Digite a linha que quer jogar.");
					i = in.nextInt()-1;
					System.out.println("Digite a coluna que quer jogar.");
					j = in.nextInt()-1;
					if(matriz[i][j].equals("-")) {
						matriz[i][j] = "O";
						erro=0;
					} else {
						erro=1;
						System.out.println("Jogada Inválida, Jogue novamente...");
					}
					for(i=0;i<=2;i++) {
						for(j=0;j<=2;j++) {
							System.out.print(matriz[i][j]+ " ");
						}
						System.out.println();
					}
				}while(erro == 1);
				for(i=0;i<=2;i++) {
					for(j=0;j<=2;j++) {
						if(matriz[i][j].equals("X")) {
							x= x+1;
							if(x==3) {
								ganhador= "X";
							}
						}
						
						else if(matriz[i][j].equals("O")) {
							o= o+1;
							if(o==3) {
								ganhador= "O";	
							}
						}
					}
					o=0;
					x=0;
				}
				for(j=0;j<=2;j++) {
					for(i=0;i<=2;i++) {
						if(matriz[i][j].equals("X")) {
							x= x+1;
							if(x==3) {
								ganhador= "X";
							}
						}
						
						else if(matriz[i][j].equals("O")) {
							o= o+1;
							if(o==3) {
								ganhador= "O";	
							}
						}
					}
					o=0;
					x=0;
				}
			}
		}while(ganhador == null);
				
		
		System.out.println("Ganhador é "+ganhador+".");
		in.close();
	}
}