public class Livre extends Document implements Empruntable{
    //constructeur
    public Livre(int id,String titre,String auteur,String type,int page,int anne){
        super(id,titre,auteur,type,page,anne);
    }

    @Override
    public  void afficherDetail(){
        System.out.println("Auteur:" +auteur+ "année:" +annee+ "livre:" );
    }
    @Override
    public  void emprunter(){
        System.out.println("Le vivre a été emprunté");
    }

    @Override
    public  void retourner(){
        System.out.println("Le vivre a été retourné");
    }
}
