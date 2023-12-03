package complexe_tableau;
public abstract class  Complexe  {
     private float reel ;
     private float imaginaire ;
     private Complexe z1 , z2 ;
     
        public Complexe(float r, float i) {	
        }
     
        
		public abstract float getReel() ;

		public abstract void setReel(float reel) ;

		public abstract float getImaginaire();

		public abstract void setImaginaire(float imaginaire);
      
     /*  public float reelPart(Complexe A) {
    	   return A.reel ;
       }
       
       public float imaginairePart(Complexe A) {
    	   return A.imaginaire ;
       }  */
       
       public abstract float [] cons(float r , float i) ;
       
       public float [] addC(Complexe A , Complexe B ) {
    	   float [] list = new float [2];
    	   list [0] = A.getReel() + B.getReel();
    	   list [1] = A.getImaginaire() + B.getImaginaire() ;
    	   return list ;
       }
       
       public   float [] sousC(Complexe A , Complexe B) {
    	   float [] list = new float [2];
    	   list [0] = A.getReel() - B.getReel();
    	   list [1] = A.getImaginaire() - B.getImaginaire() ;
    	   return list ;
       }
       
         public   double moduleux(Complexe A) {
        	 return Math.sqrt(A.getReel() * A.getReel() + A.getImaginaire() * A.getImaginaire());
         }
      
           public   Complexe maxC(Complexe A , Complexe B) {
        	   if(moduleux(A) > moduleux(B)) {
        		   return A ;
        	   }else {
        		   return B ;
        	   }
           }

              
       
}
