package ClasesYAtributos;

/**
 *
 * @author Gaby
 */
public class Cadena {

    private String frase;
    private int longitud;
//------------------------------

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
//-------------------------------------------

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
//---------------------------------------------

    public int mostrarVocales() {
        int vocales = 0;

        for (int i = 0; i < getLongitud(); i++) {

            String vocal = getFrase().substring(i, i + 1);

            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {

                vocales += 1;
            }
        }
        return vocales;
    }

//++++++++++++++++++++++++
    public void InvertirFrase() {

        for (int i = getLongitud(); i > 0; i--) {
            System.out.print(getFrase().substring(i - 1, i));
        }
        System.out.println(" ");
    }

//++++++++++++++++++++++++
    public void vecesRepetidas(String letra) {

        int j = 0;

        for (int i = 0; i < getLongitud(); i++) {

            if (getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {

                j += 1;
            }
        }
        System.out.println("El carácter " + letra + " se repite " + j + " veces");

    }

//++++++++++++++++++++++++++
    public void compararLongitud(String frase, String nFrase) {

        if (frase.length() == nFrase.length()) {

            System.out.println("Las dos fraces son de la misma longitud :)");

        } else if (frase.length()>nFrase.length()) {

            System.out.println("Las frases tienen diferente longitud y la primera es la mas grande de las dos.");

        } else {

            System.out.println("Las frases tienen diferente longitud y la segunda es la mas grande de las dos.");
        }
    }

//+++++++++++++++++++++++++++
    public void unirFrase(String frase) {

        System.out.println(getFrase().concat(frase));
    }

//+++++++++++++++++++++++++++++
    public void reemplazar(String letra) {

        for (int i = 0; i < getLongitud(); i++) {

            if (getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {

                System.out.print(letra);
            } else {
                System.out.print(getFrase().substring(i, i + 1));
            }
        }
    }

//++++++++++++++++++++++++++++++++++
    public boolean contiene(String letra) {
        for (int i = 0; i < getLongitud(); i++) {

            if (getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                System.out.println("La letra se encuentra en la frase");
                break;
            }else{
                System.out.println("La letra no se encuentra en la frase");
                break;
            }
        }
        return getFrase().contains(letra);
    }

}
