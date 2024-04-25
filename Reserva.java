public class Reserva {
    private Passageiro passageiro;
    private Viagem viagem;
    private Integer onibus;
    private int assento;
    private String status;

    public Passageiro getPassageiro() {
        return this.passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Viagem getViagem() {
        return this.viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public Integer getOnibus() {
        return this.onibus;
    }

    public void setOnibus(Integer onibus) {
        this.onibus = onibus;
    }

    public int getAssento() {
        return this.assento;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Reserva(Passageiro passageiro, Viagem viagem, Integer onibus, int assento, String status){
        this.passageiro = passageiro;
        this.viagem = viagem;
        this.onibus = onibus;
        this.assento = assento;
        this.status = status;
    }
}
