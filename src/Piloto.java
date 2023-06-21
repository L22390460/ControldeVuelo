public class Piloto {
    String nombre;
    String itinerario;
    public Piloto(String nombre){
        this.nombre = nombre;
        this.itinerario = "";
    }

    public String getNombre() {
        return nombre;
    }

    public static String getItinerario() {
        return getItinerario();
    }
    public void itinerarioElegido(String itinerario){
        this.itinerario = itinerario;
    }
}
