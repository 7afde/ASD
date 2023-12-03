package complexe_tableau;

public class Main {

	public static void main(String[] args) {


		
		
		ComplexeTableau A  = new ComplexeTableau(12 , 32) ;
		ComplexeTableau B  = new ComplexeTableau(13 , 33) ;
		ComplexeTableau C  = new ComplexeTableau(0 , 0) ;
		System.out.println("Reel part is : "+A.getReel());
		System.out.println("Reel part is : "+A.getImaginaire());
		
		float [] p = C.addC(A , B);
		System.out.println("somme de deux nombres : "+p[0] +" "+p[1]);

		float [] l = C.sousC(A, B);
		System.out.println("somme de deux nombres : "+l[0] +" "+l[1]);
			
		double w = C.moduleux(A);
		System.out.println("somme de deux nombres : "+w);
			
		Complexe e = C.maxC(A, B);
		System.out.println("somme de deux nombres : "+e.getReel() + " "+e.getImaginaire());
	}
}


