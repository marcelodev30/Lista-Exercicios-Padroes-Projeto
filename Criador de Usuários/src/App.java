public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("2. Factory Method – Criador de Usuários");

        UserFactory factory = new UserFactory();

        User admin = factory.createUser("admin");
        User editor = factory.createUser("editor");
        User viewer = factory.createUser("viewer");

        admin.exibirPermissoes();
        editor.exibirPermissoes();
        viewer.exibirPermissoes();
    }
}
