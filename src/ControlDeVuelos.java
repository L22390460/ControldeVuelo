public class ControlDeVuelos {
    Avion avion;
    Piloto piloto;

    public ControlDeVuelos(Avion avion, Piloto piloto) {
        this.avion = avion;
        this.piloto = piloto;
    }

    public void vueloElegido(Itinerario itinerario) {
        if (avion == null || piloto == null) {
            System.out.println("Se debe elegir el avion y el piloto para poder seleccionar el Vuelo");
            return;
        }
        if (!Piloto.getItinerario().isEmpty()) {
            System.out.println("El piloto seleccionado ya fue asignado a otro vuelo");
            return;
        }
        if (extisteChoque(itinerario)) {
            System.out.println("El piloto seleccionado tiene un Choque de Horarios");
            return;
        }
        piloto.itinerarioElegido(convertirItinerarioAString(itinerario));
        System.out.println("El vielo fue Elegido Correctamiente.");
    }
    private String convertirItinerarioAString(Itinerario itinerario) {
        return itinerario.getCiudadDeSalida() + " - " + itinerario.getCidudadDeEntrada() + " | Hora: " + itinerario.getHoraDeDespegue() + "- " + itinerario.getHoraDeLlegada();
    }
    private  boolean extisteChoque(Itinerario nuevoItinerario){
        if (Piloto.getItinerario().isEmpty()){
            return false;
        }
        Itinerario itinerarioExistente = convertirItinerarioAString(Piloto.getItinerario());
        if (nuevoItinerario.getHoraDeDespegue().isBefore(itinerarioExistente.getHoraDeLlegada())) && nuevoItinerario.getHoraDeLlegada().isAfter(itinerarioExistente.getHoraDeDespegue())){
        return true;
        }
        return false;
    }
    private Itinerario convertirStringAItinerario(String StrItinerario){
        String[] partes = StrItinerario.split("-- |Hora: ");
        String[] ciudades = partes[0].split(" - ");
        String[] horas = partes [1].split(" - ");
        return new Itinerario(ciudades[0], ciudades[1], horas[0], horas[1]);
    }
}