package calculadoraSobrecarga;

public class CalculadoraSobrecarga {
	double n1, n2, soma, sub, mult, div;
	public void calc() {
	System.out.println("A soma desses números é: "+(n1+n2));
	}
	public void calc(double n1,double n2) {
		System.out.println("A subtração desses números é: "+(n1-n2));
	}
	public double calc1() {
		mult= n1*n2;
		return(mult);
	}
	public double calc1(double n1,double n2) {
		div= n1/n2;
		return(div);
	}
}
