public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("5. Builder + Singleton – Sistema de Perfis");
        PerfilBuilder pessoa1 = new PerfilBuilder.Builder("alves").setIdade(22).setEmail("alves@gmail.com").build();
        PerfilBuilder pessoa2 = new PerfilBuilder.Builder("olivira").setIdade(23).setEmail("Oliveira@gmail.com").build();
       
        
        PerfilManager lisManager = PerfilManager.getInstancia();
        lisManager.addPerfis(pessoa1);
        lisManager.addPerfis(pessoa2);
        lisManager.addPerfis(new PerfilBuilder.Builder("dev").setIdade(25).setEmail("dev@gmail.com").build());

        lisManager.listarPerfis();
    
    }
}
