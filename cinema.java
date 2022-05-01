/**
 * cinema
 */
public class cinema {

    private String nome;
    private int faixaetaria;
    private int capacidadeSala;

    public cinema(String separadortxt) {

        String[] separadorsplit = separadortxt.split(";", 3);

        this.nome = separadorsplit[0];
        this.faixaetaria = setFaixaEtaria(separadorsplit[1]);
        this.capacidadeSala = StringToInteger(separadorsplit[2]);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFaixaEtaria() {
        return faixaetaria;
    }
    public int setFaixaEtaria(String faixaetaria) {
        if(faixaetaria.equalsIgnoreCase("L")){
            this.faixaetaria = 0;
            return 0;

        }else {
            this.faixaetaria = StringToInteger(faixaetaria);
            return StringToInteger(faixaetaria);
        }
    }
    public int getCapacidadeSala() {
        return capacidadeSala;
    }
    public void setCapacidadeSala(int capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }

    public int StringToInteger(String entrada){
            return Integer.parseInt(entrada);
    }
    
}