public class Main
{
    public static void main(String[] args)
    {
        Fichier f=new Fichier("f1",2);
        Fichier ff=new Fichier("f2",4);
        Repertoire r= new Repertoire("repertoire");
        r.add_elem(f);
        r.add_elem(ff);
        System.out.println(r.Taille());
    }
}