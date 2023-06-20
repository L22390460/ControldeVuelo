import java.time.LocalTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
public class Vuelos {
    String origen;
    String destino;
    LocalTime horaDeDespegue;
    LocalTime horaDeLlegada;
    Aviones avion;
    Pilotos piloto;
    public Vuelos(String origen, String destino, LocalTime horaDeDespegue, LocalTime horaDeLlegada){
        this.origen = origen;
        this.destino = destino;
        this.horaDeDespegue = horaDeDespegue;
        this.horaDeLlegada = horaDeLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalTime getHoraDeDespegue() {
        return horaDeDespegue;
    }

    public LocalTime getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public Aviones getAvion() {
        return avion;
    }
    public void setAvion(Aviones avion){
        this.avion = avion;
    }

    public Pilotos getPiloto() {
        return piloto;
    }
    public void setPiloto(Pilotos piloto){
        this.piloto=piloto;
    }
}
