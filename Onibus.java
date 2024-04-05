import java.util.List;

public class Onibus {
        private String placa;
        private String modelo;
        private List<Passageiro> passageiros;
        private boolean[] assentos;

        public Onibus(String placa, String modelo, List<Passageiro> passageiros) {
                this.placa = placa;
                this.modelo = modelo;
                this.passageiros = passageiros;
                this.assentos = new boolean[42];
        }
        
        public String getPlaca() {
                return placa;
        }

        public String getModelo() {
                return modelo;
        }

        public List<Passageiro> getPassageiros() {
                return passageiros;
        }

        public void setPlaca(String placa) {
                this.placa = placa;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public void setPassageiros(List<Passageiro> passageiros) {
                this.passageiros = passageiros;
        }

        public void addPassageiro(Passageiro passageiro) {
                passageiros.add(passageiro);
        }

        public void removePassageiro(Passageiro passageiro) {
                passageiros.remove(passageiro);
        }

        public void removePassageiro(int index) {
                passageiros.remove(index);
        }

        public void removePassageiros() {
                passageiros.clear();
        }

        public int getQuantidadePassageiros() {
                return passageiros.size();
        }

        public boolean isOnibusCheio() {
                return passageiros.size() == 42;
        }

        public boolean isOnibusVazio() {
                return passageiros.isEmpty();
        }

        public boolean isPassageiroNoOnibus(Passageiro passageiro) {
                return passageiros.contains(passageiro);
        }

        public boolean isPassageiroNoOnibus(String nome) {
                for (Passageiro passageiro : passageiros) {
                        if (passageiro.getNome().equals(nome)) {
                                return true;
                        }
                }
                return false;
        }

        public Passageiro getPassageiro(String nome) {
                for (Passageiro passageiro : passageiros) {
                        if (passageiro.getNome().equals(nome)) {
                                return passageiro;
                        }
                }
                return null;
        }

        public Passageiro getPassageiro(int index) {
                return passageiros.get(index);
        }

        public void printPassageiros() {
                for (Passageiro passageiro : passageiros) {
                        System.out.println(passageiro);
                }
        } 

        public void ocuparAssento(int numeroAssento) {
                if (numeroAssento >= 0 && numeroAssento < assentos.length) {
                        assentos[numeroAssento] = true;
                }
        }

        public void liberarAssento(int numeroAssento) {
                if (numeroAssento >= 0 && numeroAssento < assentos.length) {
                        assentos[numeroAssento] = false;
                }
        }

        public boolean isAssentoOcupado(int numeroAssento) {
                if (numeroAssento >= 0 && numeroAssento < assentos.length) {
                        return assentos[numeroAssento];
                }
                return false;
        }

        @Override
        public String toString() {
                return "Placa: " + placa + ", Modelo: " + modelo + ", Passageiros: " + passageiros;
        }

}
