package complexe_tableau;

public abstract class main extends complexe{
    public main(float real, float ima) {
        super(real, ima);
    }







    public static void main(String[] args) {
        complexe_tableau z1 = new complexe_tableau(12, 14);

        complexe_tableau z2 = new complexe_tableau(14,12);
        complexe_tableau result = new complexe_tableau(0,0);
        float [] p = result.addC(z1,z2);

        System.out.println(p[0]+"  "+p[1]);
        float [] q = result.soustC(z1,z2);
        System.out.println(q[0]+"  "+q[1]);





    }
}
