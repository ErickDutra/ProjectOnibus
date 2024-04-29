import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
        public static void ocuparAssentos(Onibus onibus, List<Integer> assentosParaOcupar) {
                for (Integer assento : assentosParaOcupar) {
                        onibus.ocuparAssento(assento);
                }
        }

        public static List<Reserva> atualizarReserva(List<Reserva> allReservas, Reserva reserva) {
                for (int i = 0; i < allReservas.size(); i++) {
                        Reserva r = allReservas.get(i);
                        if (r.getPassageiro().equals(reserva.getPassageiro())) {
                                allReservas.set(i, reserva);
                        }
                }
                return allReservas;
        }

        public static void main(String[] args) {
                Passageiro passageiro1 = new Passageiro("João", "123.456.789-00", "joao@gmail.com");
                Passageiro passageiro2 = new Passageiro("Maria", "987.654.321-00", "mari@gmail.com");
                Passageiro passageiro3 = new Passageiro("José", "456.789.123-00", "josé@gmail.com");
                Passageiro passageiro4 = new Passageiro("Ana", "654.321.987-00", "anao@gmail.com");
                Passageiro passageiro5 = new Passageiro("Carlos", "789.123.456-00", "carlos@gmail.com");
                Passageiro passageiro6 = new Passageiro("Mariana", "321.987.654-00", "mariana@gmail.com");
                Passageiro passageiro7 = new Passageiro("Pedro", "123.456.789-00", "pedro@gmail.com");
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

                Queue<Reserva> filaReservasViagem1 = new LinkedList<>();
                Queue<Reserva> filaReservasViagem2 = new LinkedList<>();

                // Passageiro passageiro = filaReservas.remove();
                // System.out.println("Reserva confirmada para: " + passageiro.getNome());

                // passageiro = filaReservas.peek();
                // System.out.println("Próxima reserva a ser confirmada: " +
                // passageiro.getNome());

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
                List<Reserva> allReservas = new ArrayList<>();

                while (true) {

                        List<Integer> assentosParaOcuparViagem1 = new ArrayList<>(
                                        Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
                        ocuparAssentos(onibus1, assentosParaOcuparViagem1);
                        List<Integer> assentosParaOcuparViagem2 = new ArrayList<>(Arrays.asList(0, 1, 5));
                        ocuparAssentos(onibus2, assentosParaOcuparViagem2);
                        System.out.println("Bem vindo ao sistema de viagens");
                        Scanner s = new Scanner(System.in);
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Listar viagens");
                        System.out.println("2 - Reservar Viagem");
                        System.out.println("3 - Check-in Reserva");
                        System.out.println("4 - Listar Reservas");

                        System.out.println("8 - Sair");
                        Integer option = s.nextInt();

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
                                        System.out.println("(1) São Paulo - Rio de Janeiro "
                                                        + (onibus1.isOnibusCheio() ? ("(Esgotado)")
                                                                        : ("(Disponivel: " + onibus1
                                                                                        .getAssentosDisponiveis()
                                                                                        + " - Assentos disponiveis)"))
                                                        + " | (2) Brasilia - Curitiba  "
                                                        + (onibus2.isOnibusCheio() ? ("(Esgotado)")
                                                                        : ("(Disponivel: " + onibus2
                                                                                        .getAssentosDisponiveis()
                                                                                        + " - Assentos disponiveis)")));
                                        System.out.println("Digite o número da viagem:");
                                        Integer numeroViagem = s.nextInt();

                                        Viagem selecaoViagem = viagem1;
                                        Integer assento = 0;
                                        if (numeroViagem == 1) {
                                                System.out.println("Viagem selecionada: São Paulo - Rio de Janeiro");
                                                System.out.println("Quantidade de assentos:"
                                                                + onibus1.getNumeroDeAssentos());
                                                System.out.println("Assentos ocupados no ônibus 1:");
                                                for (int i = 0; i < onibus1.getNumeroDeAssentos(); i++) {
                                                        if (onibus1.isAssentoOcupado(i)) {
                                                                System.out.println("Assento " + i + " está ocupado");
                                                        } else {
                                                                System.out.println("Assento " + i + " está disponivel");
                                                        }
                                                }
                                                System.out.println("Digite o número do assento:");
                                                assento = s.nextInt();
                                                while (onibus1.isAssentoOcupado(assento)) {
                                                        System.out.println("Assento ocupado");
                                                        assento = s.nextInt();
                                                }
                                                Reserva reserva = new Reserva(passageiro, selecaoViagem,
                                                                onibus1.getNumeroDoOnibus(), assento, "PENDENTE");
                                                filaReservasViagem1.add(reserva);
                                                selecaoViagem = viagem1;
                                                allReservas.add(reserva);
                                                break;

                                        } else if (numeroViagem == 2) {
                                                System.out.println("Viagem selecionada: Brasilia - Curitiba");
                                                System.out.println("Quantidade de assentos:"
                                                                + onibus2.getNumeroDeAssentos());
                                                System.out.println("Assentos ocupados no ônibus 1:");
                                                for (int i = 0; i < onibus2.getNumeroDeAssentos(); i++) {
                                                        if (onibus2.isAssentoOcupado(i)) {
                                                                System.out.println("Assento " + i + " está ocupado");
                                                        } else {
                                                                System.out.println("Assento " + i + " está disponivel");
                                                        }

                                                }
                                                System.out.println("Digite o número do assento:");
                                                assento = s.nextInt();
                                                while (onibus2.isAssentoOcupado(assento)) {
                                                        System.out.println("Assento ocupado");
                                                        assento = s.nextInt();
                                                }
                                                Reserva reserva = new Reserva(passageiro, selecaoViagem,
                                                                onibus1.getNumeroDoOnibus(), assento, "PENDENTE");
                                                filaReservasViagem2.add(reserva);
                                                selecaoViagem = viagem2;
                                                allReservas.add(reserva);
                                                break;
                                        }
                                case 3:
                                        System.out.println("Para fazer o check-in, digite o numero da viagem:");
                                        Integer numeroViagemCheckIn = s.nextInt();
                                        if (numeroViagemCheckIn == 1) {
                                                for (Reserva reserva : filaReservasViagem1) {
                                                        System.out.println(reserva);
                                                        System.out.println("");
                                                }
                                                System.out.println("Reservas feita em fila para viagem 1");
                                                Reserva reserva = filaReservasViagem1.remove();
                                                if (onibus1.isAssentoOcupado(reserva.getAssento())) {
                                                        System.out.println("check-in Cancelado, assento ocupado");
                                                        reserva.setStatus("CANCELADO");
                                                        allReservas = atualizarReserva(allReservas, reserva);
                                                        break;
                                                }
                                                assentosParaOcuparViagem1.add(reserva.getAssento());
                                                onibus1.ocuparAssento(reserva.getAssento());
                                                reserva.setStatus("CONFIRMADO");
                                                onibus1.addPassageiro(reserva.getPassageiro(), reserva.getAssento());
                                                allReservas = atualizarReserva(allReservas, reserva);
                                                System.out.println("Check-in realizado com sucesso para: "
                                                                + reserva.getPassageiro().getNome());

                                        }
                                        if (numeroViagemCheckIn == 2) {
                                                for (Reserva reserva : filaReservasViagem2) {
                                                        System.out.println(reserva);
                                                        System.out.println("");
                                                }
                                                System.out.println("Reservas feita em fila para viagem 1");
                                                Reserva reserva = filaReservasViagem2.remove();
                                                if (onibus2.isAssentoOcupado(reserva.getAssento())) {
                                                        System.out.println("check-in Cancelado, assento ocupado");
                                                        reserva.setStatus("CANCELADO");
                                                        allReservas = atualizarReserva(allReservas, reserva);
                                                        break;
                                                }
                                                assentosParaOcuparViagem2.add(reserva.getAssento());
                                                onibus2.ocuparAssento(reserva.getAssento());
                                                reserva.setStatus("CONFIRMADO");
                                                onibus2.addPassageiro(reserva.getPassageiro(), reserva.getAssento());
                                                allReservas = atualizarReserva(allReservas, reserva);
                                                System.out.println("Check-in realizado com sucesso para: "
                                                                + reserva.getPassageiro().getNome());

                                        }
                                        break;
                                case 4:
                                        System.out.println("Reservas feitas:");
                                        System.out.println(
                                                        "Digite uma opção: (1) Todas as reservas - (2) Reservas feitas para viagem 1 - (3) Reservas feitas para viagem2");
                                        Integer opcao = s.nextInt();
                                        if (opcao == 1) {
                                                System.out.println("Todas as reservas");
                                                for (Reserva reserva : allReservas) {
                                                        System.out.println(reserva);
                                                        System.out.println("");
                                                }
                                        } else if (opcao == 2) {
                                                System.out.println("Apenas Reservas Pendentes");
                                                System.out.println("Reservas feitas para viagem 1:");
                                                for (Reserva reserva : filaReservasViagem1) {
                                                        System.out.println(reserva);
                                                        System.out.println("");
                                                }
                                        } else if (opcao == 2) {
                                                System.out.println("Apenas Reservas Pendentes");
                                                System.out.println("Reservas feitas para viagem 2:");
                                                for (Reserva reserva : filaReservasViagem2) {
                                                        System.out.println(reserva);
                                                        System.out.println("");
                                                }
                                        }
                                        break;

                            
                                    
                                case 8:
                                        break;

                                default:
                                System.out.println("Opção inválida");
                                break;
                        }

                }
        }
}
