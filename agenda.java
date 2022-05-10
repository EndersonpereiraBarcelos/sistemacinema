public class agenda {
  
    private String nome;
    private String idade;
    private String filme;
    
    //parseInt Idade
    public agenda(String entrada) {
        
        String[] entradaA = entrada.split(";", 3);

        this.nome = entradaA[0];
        this.idade = entradaA[1];
        this.filme = entradaA[2];
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getFilme() {
        return filme;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }

    
}