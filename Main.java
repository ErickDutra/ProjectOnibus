import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Passageiro passageiro1 = new Passageiro("João", "123.456.789-00", "joao@gmail.com");
                Passageiro passageiro2 = new Passageiro("Maria", "987.654.321-00", "mari@gmail.com");
                Passageiro passageiro3 = new Passageiro("José", "456.789.123-00", "josé@gmail.com");
                Passageiro passageiro4 = new Passageiro("Ana", "654.321.987-00", "anao@gmail.com");
                Passageiro passageiro5 = new Passageiro("Carlos", "789.123.456-00", "carlos@gmail.com");
                Passageiro passageiro6 = new Passageiro("Mariana", "321.987.654-00", "mariana@gmail.com");
                Passageiro passageiro7 = new Passageiro("Pedro", "123.456.789-00","pedro@gmail.com");
                Passageiro passageiro8 = new Passageiro("Paula", "987.654.321-00", "paulo@gmail.com");
                Passageiro passageiro9 = new Passageiro("Lucas", "456.789.123-00", "lucas@gmail.com");

                List<Passageiro> passageiros_viagem1 = new ArrayList<Passageiro>();
                passageiros_viagem1.add(passageiro1);
                passageiros_viagem1.add(passageiro2);
                passageiros_viagem1.add(passageiro3);
                passageiros_viagem1.add(passageiro4);
                passageiros_viagem1.add(passageiro5);
                passageiros_viagem1.add(passageiro6);
                passageiros_viagem1.add(passageiro7);
                passageiros_viagem1.add(passageiro8);
                passageiros_viagem1.add(passageiro9);

                List<Passageiro> passageiros_viagem2 = new ArrayList<Passageiro>();
                passageiros_viagem2.add(passageiro1);
                passageiros_viagem2.add(passageiro2);
                passageiros_viagem2.add(passageiro9);

                Queue<Reserva> filaReservas = new LinkedList<>();

                //Passageiro passageiro = filaReservas.remove();
                //System.out.println("Reserva confirmada para: " + passageiro.getNome());

        
                //passageiro = filaReservas.peek();
                //System.out.println("Próxima reserva a ser confirmada: " + passageiro.getNome());

                Onibus onibus1 = new Onibus(2289, "Mercedes-Benz", passageiros_viagem1);
                Onibus onibus2 = new Onibus(1145, "Volvo", passageiros_viagem2);

                Viagem viagem1 = new Viagem(
                                onibus1.getNumeroDoOnibus(),
                                "Sao Paulo",
                                "Rio de Janeiro",
                                "08:00",
                                "14:00",
                                10);
                Viagem viagem2 = new Viagem(
                                onibus2.getNumeroDoOnibus(),
                                "Brasilia",
                                "Curitiba",
                                "08:00",
                                "14:00",
                                10);

                List<Viagem> viagens = new ArrayList<>();
                viagens.add(viagem1);
                viagens.add(viagem2);

                while (true) {
                        System.out.println("Bem vindo ao sistema de viagens");
                        Scanner s = new Scanner(System.in);
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Listar viagens");
                        System.out.println("2 - Reservar Viagem");

                        System.out.println("8 - Sair");
                        Integer option = s.nextInt();
                        System.out.println(onibus1.getPassageiros());
                        
                        switch (option) {
                                case 1:
                                    for (Viagem viagem : viagens) {
                                        System.out.println("Viagens:");
                                        System.out.println(viagem);
                                    }
                                    break;
                                case 2:
                                        System.out.println("Digite o nome do passageiro:");
                                        String nome = s.next();
                                        System.out.println("Digite o CPF do passageiro:");
                                        String cpf = s.next();
                                        System.out.println("Digite o email do passageiro:");
                                        String email = s.next();
                                        Passageiro passageiro = new Passageiro(nome, cpf, email);
                                        System.out.println("Digite o número da viagem:");
                                        Integer numeroViagem = s.nextInt();
                                        System.out.println("(1) São Paulo - Rio de Janeiro | (2) Brasilia - Curitiba");
                                        Viagem selecaoViagem = viagem1;
                                        if(numeroViagem == 1){
                                                selecaoViagem = viagem1;
                                                System.out.println("Viagem selecionada: São Paulo - Rio de Janeiro");
                                        }else if(numeroViagem == 2){
                                                selecaoViagem = viagem2;
                                                System.out.println("Viagem selecionada: Brasilia - Curitiba");
                                        }
                                        System.out.println("Digite o número do assento:");
                                        Integer assento = s.nextInt();
                                        

                                        Reserva reserva = new Reserva(passageiro,selecaoViagem,onibus1.getNumeroDoOnibus(), assento, "PENDENTE");
                                        filaReservas.add(reserva);
                                case 8:
                                    break;
                                
                                default:
                                    
                                    break;
                            }

                }
        }
}
