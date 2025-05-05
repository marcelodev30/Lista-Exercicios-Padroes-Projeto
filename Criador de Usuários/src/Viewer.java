public class Viewer implements User {
    @Override
    public void exibirPermissoes() {
        System.out.println("Viewer: acesso apenas leitura — visualiza conteúdos, sem alterações.");
    }
}