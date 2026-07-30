public class Ebook extends Document{
    //constructeur
    public Ebook(int id,String titre,String auteur,String type,int page,int anne){
        super(id,titre,auteur,type,page,anne);
    }
    @Override
    public  void afficherDetail(){
        System.out.println("Id:" + id +"Auteur:" +auteur+ "année:" +annee+ "livre:" );
    }
}
