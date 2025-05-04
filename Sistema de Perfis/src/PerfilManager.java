import java.util.ArrayList;
import java.util.List;

public class PerfilManager {

    private List<PerfilBuilder> perfis;
    private static PerfilManager instancia;

    private PerfilManager(){
        perfis = new ArrayList<>();
    }

    public static PerfilManager getInstancia(){
        return instancia;
    }
    
    public void addPerfis( PerfilBuilder perfi){
        perfis.add(perfi);
    }

    public void listarPerfis(){
        System.out.println("Lista de Perfis add");
        for (int i=0; i <= perfis.size();i++){
            System.out.println(perfis.get(i));
        }
    }
}
