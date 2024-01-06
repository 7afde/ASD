package Liste_abstract;

public class Etudiant {
    private int Ncarte;
    private String name;
    private String prenom;
    private int date;
    private String adress;

    public Etudiant(int ncarte, String name, String prenom, int date, String adress) {
        this.Ncarte = ncarte;
        this.name = name;
        this.prenom = prenom;
        this.date = date;
        this.adress = adress;
    }
}
