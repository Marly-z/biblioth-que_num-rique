public class Main {

    public static void main(String[] args) {

        document.add(livre);
        document.add(Revue);
        document.add(Ebook);
        livre.emprunter();
        Revue.emprunter();
        livre.retourner();
        revue.retourner();
    }
}
