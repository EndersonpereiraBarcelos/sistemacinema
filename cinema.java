/**
 * cinema
 */
public class cinema {

    private String nomefilme;
    private String faixaetaria;
    private String capacidadeSala;

    public cinema(String separadortxt) {

        String[] separadorsplit = separadortxt.split(";", 3);

        this.nomefilme = separadorsplit[0];
        this.faixaetaria = separadorsplit[1];
        this.capacidadeSala = separadorsplit[2];
    }
    public String getnomefilme() {
        return nomefilme;
    }
    public void setnomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }
    public String getfaixaetaria() {
        return faixaetaria;
    }
    public void setfaixaetaria(String faixaetaria) {
        this.faixaetaria = faixaetaria;
    }
    public String getcapacidadeSala() {
        return capacidadeSala;
    }
    public void setcapacidadeSala(String capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }
    

    
}