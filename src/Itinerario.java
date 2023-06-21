import  java.time.LocalTime;
public class Itinerario {
    String ciudadDeSalida;
    String cidudadDeEntrada;
    LocalTime horaDeDespegue;
    LocalTime horaDeLlegada;
    public Itinerario(String ciudadDeSalida, String cidudadDeEntrada, String horaDeDespegue, String horaDeLlegada){
        this.ciudadDeSalida = ciudadDeSalida;
        this.cidudadDeEntrada = cidudadDeEntrada;
        this.horaDeDespegue = LocalTime.parse(horaDeDespegue);
        this.horaDeLlegada = LocalTime.parse(horaDeLlegada);
    }
    public String getCiudadDeSalida() {
        return ciudadDeSalida;
    }
    public String getCidudadDeEntrada(){
        return  cidudadDeEntrada;
    }
    public LocalTime getHoraDeDespegue(){
        return horaDeDespegue;
    }
    public LocalTime getHoraDeLlegada(){
        return horaDeLlegada;
    }
}

