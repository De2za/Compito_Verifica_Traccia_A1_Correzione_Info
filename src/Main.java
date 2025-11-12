import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvenuto in libreria");
        System.out.println("Menu");
        System.out.println("Seleziona 1 per creare un libro con info complete, 2 per creare un libro solo con autore e titolo");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Inserisci il titolo");
                String titolo = sc.next();
                System.out.println("Inserisci autore");
                String autore = sc.next();
                System.out.println("Inserisci nome casa editrice");
                String casaEd = sc.next();
                System.out.println("Inserisci numero pagine");
                int dim = sc.nextInt();
                System.out.println("Creazione del libro ... ... ..");
                Libro l1 = new Libro(titolo, autore, casaEd, dim);
                System.out.println("Libro creato");
                System.out.println(l1.toString());
                break;
            case 2:
                System.out.println("Inserisci il titolo");
                String titolos = sc.next();
                System.out.println("Inserisci autore");
                String autores = sc.next();
                System.out.println("Creazione del libro ... ... ..");
                Libro ls = new Libro(titolos, autores);
                System.out.println("Libro creato");
                System.out.println(ls.toString());
                break;
            default:
                System.out.println("Opzione non valida");
                break;
        }


    }
}