package complexe_tableau;



public class complexe_tableau extends complexe{
    float [] comp = new float[2];

    @Override
    public float[] constC(float real, float ima) {
        return new float[0];
    }

    public complexe_tableau(float real, float ima) {
        super(real,ima);
        comp [0] = real;
        comp [1] = ima;
    }


    @Override
    public float getReal() {
        return comp[0];
    }

    @Override
    public void setReal(float real) {
        this.comp[0] = real;
    }

    @Override
    public float getIma() {
        return comp[1];
    }

    @Override
    public void setIma(float ima) {
        this.comp[1] = ima;
    }


    /*public static Complexe addC(Complexe z1, Complexe z2){
        return constC(rl(z1)+rl(z2),im(z1)+im(z2));
    }
    public static Complexe soustC(Complexe z1, Complexe z2){
        return constC(rl(z1)-rl(z2),im(z1)-im(z2));
    }
    public static float module(Complexe z){
        return (float) Math.sqrt(rl(z)*rl(z)+im(z)*im(z));
    }
    public static Complexe maxmodeule(Complexe z1, Complexe z2){
        if(module(z1) > module(z2)){
            return z1;
        }else{
            return z2;
        }
    }
     public static void main(String[] args) {
        Complexe z1 = new Complexe(12,14);
        Complexe z2 = new Complexe(14,12);
        Complexe result = new Complexe();
        System.out.println(addC(z1,z2).getReal()+"  "+addC(z1,z2).getIma());

        System.out.println(soustC(z1,z2).getReal()+" "+soustC(z1,z2).getIma());

        System.out.println(module(z1));
        System.out.println(module(z2));

        System.out.println(maxmodeule(z1,z2).getReal()+"  "+maxmodeule(z1,z2).getIma());

    }
     */


}
