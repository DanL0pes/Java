import java.util.*;

public class MaisNovoVelho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, idadeV = 0, idadeN = 0;
        String nome, nomeN = "", nomeV = "";
        for(int i=10;i>=1;i--){
            System.out.print("Digite o "+(10-i+1)+". nome: ");
            nome = in.next();
            System.out.print("Digite a "+(10-i+1)+". idade: ");
            idade = in.nextInt();

            if(idade >= idadeV){
                idadeV = idade;
                nomeV = nome;
            }
            if(idade <= idadeN || i==10){
                idadeN = idade;
                nomeN = nome;
            }
        }
        System.out.println("A pessoa "+nomeN+" é a mais novo, tendo "+idadeN+" anos.");
	System.out.println("A pessoa "+nomeVelho+" é a mais velha, tendo "+idadeVelho+" anos."
        in.close();
    }
}