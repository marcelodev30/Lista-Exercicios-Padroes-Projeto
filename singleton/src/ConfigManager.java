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


}
