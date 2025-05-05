public class Director {
    public Carro construirCarroPopular(CarroBuilder builder) {
        return builder.setCor("Banco").setMotor("1.0").setTipoCombustivel("Etanol").setPortas(4).build();
    } 

    public Carro construirCarroEsportivo(CarroBuilder builder) {
        return builder.setMotor("2.0").setCor("Preto").setPortas(2).setTipoCombustivel("Gasolina").build();
    }

}
