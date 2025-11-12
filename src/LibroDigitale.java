public class LibroDigitale extends Libro implements Consultabile {
    // in verifica oltre ad estendere ho creato un istanza di Libro ed ho lavorato con quella
    public LibroDigitale(String titolo, String autore, String caseEdit, int dim) {
        super(titolo, autore, caseEdit, dim);
    }

    public LibroDigitale(String titolo, String autore) {
        super(titolo, autore);
    }

    @Override
    public void consultaOnline(){
        System.out.println("Leggendo...");
    }

    @Override
    public void Stampa(){
        System.out.println("Stampa in corso...");
    }

    @Override
    public String toString(){
        return "{" + "Titolo: " + getTitolo() + "Autore: " + getAutore() + "Casa Editrice: " + getCaseEdit() + "Numero pagine" + getpLib().length + "Dimensione Byte" + (super.getpLib().length)*100 + "}";
        //in verifica scrivevo le variabilidell'istanza creata per sbaglio, non della superclasse attraverso metodi.
    }
}
