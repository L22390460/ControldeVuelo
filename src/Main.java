public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion("Boeing 320", "1504");
        Piloto piloto1 = new Piloto("Lucia Noceda");
        Itinerario itinerario1 = new Itinerario("Ciudad A","ciudad B", "00:50","06:00");

        ControlDeVuelos control1 = new ControlDeVuelos(avion1,piloto1);
        control1.vueloElegido(itinerario1);
        Avion avion2 = new Avion("Airbus A780","5678");
        Piloto piloto2 = new Piloto("Edalyn Rodrigues");
        Itinerario itinerario2 = new Itinerario("Ciudad C", "Ciudad D","07:00", "13:00");

        ControlDeVuelos control2= new ControlDeVuelos(avion2, piloto2);
        control2.vueloElegido(itinerario2);
    }
}