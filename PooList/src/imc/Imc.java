package imc;

public class Imc {
	double res;
	String estado;
	public String imc(double peso,double altura){
		res = peso/(altura*altura);
		if(res <= 18.5) {
			estado = "Baixo Peso.";
		}else if(res<= 24.9) {
			estado = "Peso Ideal.";
		}else if(res<= 29.9) {
			estado = "Sobrepeso.";
		}else if(res<= 34.9) {
			estado = "Obesidade I.";
		}else if(res<= 39.9) {
			estado = "Obesidade II.";
		}else {
			estado = "Obesidade III.";
		}
		System.out.println(res+" kg/m²");
		return(estado);
	}
	
}
