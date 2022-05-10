package Cinema;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Scanner leitor2 = new Scanner(System.in);
  
      
        ArrayList<Sala> listaSala = new ArrayList<Sala>();
         System.out.println("Digite o número de salas ");
        int variSala = scanner.nextInt();
        for(int i=0; i<variSala; i++){
            System.out.printf("Sala %d - Digite suas informações",(i+1));
            String nomeFilme;
            String faixaEtaria;
            String capacidade;
            
            nomeFilme = leitor2.nextLine();
            faixaEtaria = leitor2.nextLine();
            capacidade = leitor2.nextLine();
            
            Sala sl = new Sala();
            sl.setNomeFilme(nomeFilme);
            sl.setFaixaEtaria(faixaEtaria);
            sl.setCapacidade(capacidade);
            
            // adicionando dentro da lista "SALA"
            listaSala.add(sl);
        }
            
        ArrayList<Agendamento> varAgendamento = new ArrayList<Agendamento>();
        int vari = scanner.nextInt();
        //Parte agendamento
        //nome, idade, filme
        for(int i=0; i<vari; i++){
            System.out.println("Digite um número para entrada ");
            System.out.printf("Agendamento %d - Digite suas informações ",(i+1));
            String nome;
            String idade;
            String filme;
            
            nome = leitor2.nextLine();
            idade = leitor2.nextLine();
            filme = leitor2.nextLine();
            
            // construtor agendamento
            // declarando a variavel "ag" do tipo Agendamento
            Agendamento ag = new Agendamento();
            ag.setNome(nome);
            ag.setIdade(idade);
            ag.setFilme(filme);
            
            // adicionando dentro da lista "Agendamento"
            varAgendamento.add(ag);
        }
        
        //SAIDA
        // o "a:" é a variavel do tipo agendamento (que vai fazer rodar enquanto houver itens dentro da lista varAgendamento
        for(Agendamento a:varAgendamento){
            Agendamento v = new Agendamento();
            Sala s = new Sala();
            
            // conferindo se o nome do filme que a pessoa vai assistir é o mesmo nome do filme que está na sala
            if(v.getFilme().equals(s.getNomeFilme())){
                System.out.printf("%s",v.getFilme());
            }
        }
        
    }
    
}