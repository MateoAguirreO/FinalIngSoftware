package src.application_core;

public class GuarderiaMascotas{
    public static void main (String[] args){
        DatosMascotas datosMascotas=new DatosMascotas();
        Mascota mascota1= new Mascota("Chaca", "Pincher", 88);
        datosMascotas.registrarMascota(mascota1);
        System.out.print(datosMascotas.getMascotas().get(0).getNombre());
    }
}