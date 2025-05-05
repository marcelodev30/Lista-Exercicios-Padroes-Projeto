public class CarroBuilder {
    private String motor;
    private String cor;
    private int portas;
    private String tipoCombustivel;

    public CarroBuilder setMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public CarroBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder setPortas(int portas) {
        this.portas = portas;
        return this;
    }

    public CarroBuilder setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        return this;
    }

    public Carro build() {
        return new Carro(motor, cor, portas, tipoCombustivel);
    }
}
