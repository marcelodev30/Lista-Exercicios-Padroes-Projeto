public class Carro {
    private String motor;
    private String cor;
    private int portas;
    private String tipoCombustivel;

    public Carro(String motor, String cor, int portas, String tipoCombustivel) {
        this.motor = motor;
        this.cor = cor;
        this.portas = portas;
        this.tipoCombustivel = tipoCombustivel;
    }


    @Override
    public String toString() {
        return "Motor: " + motor  + " Cor: "+ cor +" Portas: " + portas +" Tipo De Combustivel: " + tipoCombustivel;
    }
}
