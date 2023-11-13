package exo1;

public class Distributeur {
    private int choix;

    public Boisson selection(int choix) {
        if(choix == 1) {
            return new Boisson("Cafe", 50);
        }
        else if(choix ==2) {
            return new Boisson("The", 40);
        }
        else {
            return new Boisson("Lait", 30);
        }
    }

    public int getChoix() {
        return choix;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }

    public int monnaie(int dinars) {
        Boisson b = selection(this.choix);
        int resultat = dinars - b.getPrix();
        return resultat;
    }
}
