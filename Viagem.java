public class Viagem {
    private int numeroOnibus;
    private String origem;
    private String destino;
    private String horarioPartida;
    private String horarioChegada;
 
    private int quantidadeMaximaPassageiros;

  
    public Viagem(int numeroOnibus, String origem, String destino, String horarioPartida, String horarioChegada, int quantidadeMaximaPassageiros) {
        this.numeroOnibus = numeroOnibus;
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }

   
    public int getNumeroOnibus() {
        return numeroOnibus;
    }

    public void setNumeroOnibus(int numeroOnibus) {
        this.numeroOnibus = numeroOnibus;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }



    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public int getQuantidadeMaximaPassageiros() {
        return quantidadeMaximaPassageiros;
    }

    public void setQuantidadeMaximaPassageiros(int quantidadeMaximaPassageiros) {
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }


    @Override
    public String toString() {
        return "Viagem{" +
                "Numero do Onibus: " + numeroOnibus +
                ", Origem: '" + origem + '\'' +
                ", Destino:'" + destino + '\'' +
                ", Horario Partida: '" + horarioPartida + '\'' +
                ", Horario Chegada: '" + horarioChegada + '\'' +

                ", Quantidade Maxima de Passageiros: '" + quantidadeMaximaPassageiros +
                '}';
    }
}
