import java.time.localTime;
import java.util.ArrayList;
import java.util.List;
import java.util.list;
public class Pilotos {
    String nombre;
    List<Vuelos> itinerarios;
    public Pilotos(String nombre){
        this.nombre=nombre;
        this.itinerarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void agregarItirenario(Vuelos vuelo){
        itinerarios.add(vuelo);
    }
     public  
}
