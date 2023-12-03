package complexe_tableau;
public class ComplexeTableau extends Complexe {
	float [] comp = new float [2];
	public ComplexeTableau(float r, float i) {
		super(r, i);
        comp [0] = r ;
        comp [1] = i ; 
	}
   
	@Override
	public float getReel() {
		return comp[0];
	}
	@Override
	public void setReel(float r) {
		this.comp[0] = r ;
	}
	@Override
	public float getImaginaire() {
		return comp[1];
	}
	@Override
	public void setImaginaire(float i) {
		this.comp[1] = i ;
	}
	@Override
	public  float [] cons(float r , float i) {
		return  comp  ;
	}
	
	
	
}
