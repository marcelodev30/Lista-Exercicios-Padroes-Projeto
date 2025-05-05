public class UserFactory {

    public User createUser(String tipo) {
        switch (tipo.toLowerCase()) {
            case "admin":
                return new Admin();
            case "editor":
                return new Editor();
            case "viewer":
                return new Viewer();
            default:
                throw new IllegalArgumentException("Tipo de usuário desconhecido: " + tipo);
        }
    }
}