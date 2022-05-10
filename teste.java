import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class teste {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Scanner leitores = new Scanner(System.in);
  

        ArrayList<cinema> listaCinema = new ArrayList<cinema>();
         System.out.println("infome quantidade de salas do cinema ");
        int variSala = scanner.nextInt();
        for(int i=0; i<variSala; i++){
            System.out.printf("Sala %d - Digite suas informações " + "Nome Filme, Faixa Etaria, Capacidade sala",(i+1));
            String pessoaCinema = leitores.nextLine();
            cinema saidaPessoaCinema = new cinema(pessoaCinema);
            
            // adicionando dentro da lista "SALA"
            listaCinema.add(saidaPessoaCinema);
        }
            
        ArrayList<agenda> ListaAgendamento = new ArrayList<agenda>();
        
        System.out.println("Informe Número de agendamentos ");
        int vari = scanner.nextInt();
        //Parte agendamento
        //nome, idade, filme
        for(int i=0; i<vari; i++){
            System.out.printf("Agendamento %d - Digite suas informações " + "Nome, Idade, filme",(i+1));
            String frase = leitores.nextLine();
            
              agenda a =  new agenda(frase);

            ListaAgendamento.add(a);
        }

        //SAIDA
        for(agenda saidaAgendamento : ListaAgendamento){
            System.out.println("Nome: " + saidaAgendamento.getNome());
            System.out.println("Idade: " + saidaAgendamento.getIdade());
            System.out.println("Filme: " + saidaAgendamento.getFilme());
            
        }

        System.out.println("\n\n");

        for(cinema saidafilme : listaCinema){
            System.out.println("Nome Filme: " + saidafilme.getnomefilme());
            System.out.println("Faixa Etaria: " + saidafilme.getfaixaetaria() );
            System.out.println("Capacidade Sala: " + saidafilme.getcapacidadeSala());
            
        }
    }   
}   