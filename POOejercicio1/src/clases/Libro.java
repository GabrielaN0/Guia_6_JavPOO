package clases;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

/**
 *
 * @author Gaby
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int nPag;
    String isbnString;

    public void Libro(String titulo, String autor, int nPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPag = nPag;
    }
    
    public Libro(){
    }

    public void setIsbnString(String isbnString) {
        this.isbnString = isbn(this.titulo, this.autor, this.nPag);
    }

    public String getIsbnString() {
        return isbn(this.titulo, this.autor, this.nPag);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getnPag() {
        return nPag;
    }
    
    public String isbn(String titulo, String autor, int nPag){
        this.getTitulo();
        this.getAutor();
        this.getnPag();
        isbnString = this.getTitulo().length() + "-" + this.getAutor().length()+ this.getnPag();
        return isbnString;
    }

    @Override
    public String toString() {
        return " }--> " + " titulo:" + titulo + ", autor:" + autor + ", nPag:" + nPag + ", isbnString:" + getIsbnString();
    }

    
    
   

    

}
