public class ConfigManager {

    private String idioma;
    private String tema;
    private boolean modeEscuro;
    private static ConfigManager instancia;

private ConfigManager(){
    tema= "claro";
    modeEscuro= false;
    idioma= "pt-BR";
}

public static ConfigManager getInstancia(){
    return instancia = new ConfigManager();
}
public String getIdioma(){
    return this.idioma;
}
public String getTema(){
    return this.tema;
}
public boolean getModeEscuro(){
    return this.modeEscuro;
}

public void setIdioma(String value){
    this.idioma= value;
}

public void setTema(String value){
    this.tema= value;
}
public void setModeEscuro(boolean value){
    this.modeEscuro= value;
}

public void PrintConfiguracoes() {
    System.out.println("Idioma: " + idioma);
    System.out.println("Tema: " + tema);
    System.out.println("Modo Escuro: " + (modeEscuro ? "Ativado" : "Desativado"));
}

}
