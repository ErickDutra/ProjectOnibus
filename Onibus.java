import java.util.List;

public class Onibus {
        private Integer numeroDoOnibus;
        private String modelo;
        private List<Passageiro> passageiros;
        private boolean[] assentos;

        public Onibus(Integer numeroDoOnibus, String modelo, List<Passageiro> passageiros) {
                this.numeroDoOnibus = numeroDoOnibus;
                this.modelo = modelo;
                this.passageiros = passageiros;
                this.assentos = new boolean[9];
        }
        
        public Integer getNumeroDoOnibus() {
                return numeroDoOnibus;
        }

        public String getModelo() {
                return modelo;
        }

        public List<Passageiro> getPassageiros() {
                return passageiros;
        }

        public void setNumeroDoOnibus(Integer numeroDoOnibus) {
                this.numeroDoOnibus = numeroDoOnibus;
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

        public void addPassageiro(Passageiro passageiro, int index) {
                if (index >= 0 && index <= passageiros.size()) {
                    passageiros.add(index, passageiro);
                }
            }


        @Override
        public String toString() {
                return "Placa: " + numeroDoOnibus + ", Modelo: " + modelo + ", Passageiros: " + passageiros;
        }


}
