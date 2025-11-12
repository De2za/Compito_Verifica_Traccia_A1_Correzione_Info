public class Libro {
    private String titolo, autore, caseEdit;
    private Pagina[]pLib;

    public Libro(String titolo, String autore, String caseEdit, int dim) {
        this.titolo = titolo;
        this.autore = autore;
        this.caseEdit = caseEdit;
        this.pLib = new Pagina[dim];
    }

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }


    public String getTitolo() {
        return titolo; //in verifica ho messo return this.titolo
    }

    public String getAutore() {
        return autore;
    }

    public String getCaseEdit() {
        return caseEdit;
    }

    public Pagina[] getpLib() {
        return pLib;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setCaseEdit(String caseEdit) {
        this.caseEdit = caseEdit;
    }

    public void setpLib(Pagina[] pLib) {
        this.pLib = pLib;
    }


    public String toString() {
        if (caseEdit != null) {
            return "{" + "Titolo: " + titolo + "Autore: " + autore + "Casa Editrice: " + caseEdit + "Numero pagine" + pLib.length;
        } else{return "{" + "Titolo: " + titolo + "Autore: " + autore + "}"; }
    }

}
