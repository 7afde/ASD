
package complexe_tableau;
public class Tab {
	float [] t = new float [2];
	public Tab() {
		
	}

	public Tab(float r, float i) {
		t[0] = r;
		t[1] = i;
	}
	
	public float [] add(float [] q, float [] p) {
		float [] e = new float[2];
		e [0] = q[0] + p[0];
		e [1] = q[1] + p[1];
		return (e);
	}
	
	public float [] sous(float [] q, float [] p) {
		float [] e = new float[2];
		e [0] = q[0] + p[0];
		e [1] = q[1] + p[1];
		return (e);
	}
	
	public float module(float [] q) {
		return (float) (Math.sqrt(q[0] * q[0] + q[1] * q[1]));
	}
	
	public float[] max(float [] q, float [] p) {
		if(module(q) > module(p)) {
			return q;
		}		
		return p;		
	}
	
	
	
}
