public class Livre extends Document implements Empruntable{
    //constructeur
    public Livre(int id,String titre,String auteur,String type,int page,int anne){
        super(id,titre,auteur,type,page,anne);
    }

   
}
