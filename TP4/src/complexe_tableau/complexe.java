package complexe_tableau;

public abstract class complexe {
    complexe z1, z2;
    private float real;
    private float ima;
    public abstract float[] constC(float real, float ima);

    public complexe(float real, float ima){}


    public abstract float getReal();

    public abstract void setReal(float real);

    public abstract float getIma();

    public abstract void setIma(float ima);

    public static float rl(complexe z){
        return z.getReal();
    }
    public static float im(complexe z){
        return z.getIma();
    }
    public float[] addC(complexe z1, complexe z2){
        float [] list = new float[2];
        list [0] = z1.getReal()+ z2.getIma();
        list [1] = z2.getReal()+ z2.getIma();
        return list;
    }
    public float[] soustC(complexe z1, complexe z2){
        float [] list = new float[2];
        list [0] = z1.getReal() - z2.getIma();
        list [1] = z2.getReal() - z2.getIma();
        return list;
    }
    public double module(complexe z){
        return Math.sqrt(z.getReal() * z.getReal() + z.getIma()*z.getIma());
    }
    public complexe maxmodeule(complexe z1, complexe z2){
        if(module(z1) > module(z2)){
            return z1;
        }else{
            return z2;
        }
    }

}
