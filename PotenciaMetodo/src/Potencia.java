
public class Potencia {
	double res = 1;
	public double c(double ba, double ex) {
		if(ex==0) {
			
		}else {
			for(int i=0;i<=ex;i++) {
				res=res*ba;
			}	
		}
		
		return(res);
	}
}
