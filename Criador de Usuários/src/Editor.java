public class Editor implements User {
    @Override
    public void exibirPermissoes() {
        System.out.println("Editor: pode criar, editar e publicar conteúdos.");
    }
}