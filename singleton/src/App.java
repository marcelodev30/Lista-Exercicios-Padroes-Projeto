public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Singleton – Gerenciador de Configurações");

        ConfigManager configManager = ConfigManager.getInstancia();
        configManager.setModeEscuro(true);
        configManager.setIdioma("pt-br");

        ConfigManager newConfigManager =ConfigManager.getInstancia();
        newConfigManager.PrintConfiguracoes();
    }
}
