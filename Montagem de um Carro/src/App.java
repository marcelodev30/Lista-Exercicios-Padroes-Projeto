public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("4. Builder – Montagem de um Carro:");
        
        Director loja = new Director();
        
        Carro carroEsportivo = loja.construirCarroEsportivo(new CarroBuilder());
        Carro carroPopular = loja.construirCarroPopular(new CarroBuilder());

        System.out.println("🏎️ Carro Esportivo: " + carroEsportivo);
        System.out.println("🚗 Carro Popular: " + carroPopular);

    }
}
