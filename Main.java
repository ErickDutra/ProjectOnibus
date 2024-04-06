import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                Passageiro passageiro1 = new Passageiro("João", "123.456.789-00");
                Passageiro passageiro2 = new Passageiro("Maria", "987.654.321-00");
                Passageiro passageiro3 = new Passageiro("José", "456.789.123-00");


                
                List<Passageiro> passageiros = new ArrayList<>();
                passageiros.add(passageiro1);
                passageiros.add(passageiro2);
                passageiros.add(passageiro3);
                Onibus onibus = new Onibus(2289, "Mercedes-Benz", passageiros);
                Viagem viagem1 = new Viagem(
                        onibus.getNumeroDoOnibus(),
                        "São Paulo",
                        "Rio de Janeiro",
                        "08:00",
                        "14:00",
                        42
                );
                
                onibus.addPassageiro(passageiro3, 7);
                System.out.println(viagem1);
                System.out.println(onibus);
                System.out.println(onibus.getQuantidadePassageiros());
                System.out.println(onibus.isOnibusCheio());
                System.out.println(onibus.isOnibusVazio());
                System.out.println(onibus.isPassageiroNoOnibus(passageiro1));
                System.out.println(onibus.isPassageiroNoOnibus("Maria"));
                System.out.println(onibus.getPassageiro("José"));
                System.out.println(onibus.getPassageiro(1));
                onibus.printPassageiros();
                onibus.ocuparAssento(0);
                onibus.ocuparAssento(1);
                onibus.ocuparAssento(2);
                System.out.println(onibus.isAssentoOcupado(0));
                System.out.println(onibus.isAssentoOcupado(1));
                System.out.println(onibus.isAssentoOcupado(2));
                onibus.liberarAssento(0);
                onibus.liberarAssento(1);
                onibus.liberarAssento(2);
                System.out.println(onibus.isAssentoOcupado(0));
                System.out.println(onibus.isAssentoOcupado(1));
                System.out.println(onibus.isAssentoOcupado(2));       
        }
}


