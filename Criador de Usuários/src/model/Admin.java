public class Admin implements User {
    @Override
    public void exibirPermissoes() {
        System.out.println("Admin: acesso total — gerencia usuários, configurações.");
    }
}