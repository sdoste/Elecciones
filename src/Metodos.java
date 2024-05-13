import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    static void mostrarResultados(ArrayList<Partido> partidos){
        if (partidos.size() == 0){
            System.out.println("No se ha añadido ningún partido");
        } else{
            for(int i = 0; i<partidos.size(); i++){
                System.out.println("Partido " + partidos.get(i).getNombre() + ": " + Metodos.numeroEscaños(partidos.get(i).getPorcentaje()));
            }
        }
    }
    static void limpiarPantalla(){
        System.out.println("//      //      //      //      //      //");
        System.out.println("//      //      //      //      //      //");
        System.out.println("//      //      //      //      //      //");
        System.out.println("//      //      //      //      //      //");
        System.out.println("//      //      //      //      //      //");
        System.out.println("//      //      //      //      //      //");
    }
    static void aprietaEnter(Scanner teclado){
        String teclaEnter = "d";
        while(!(teclaEnter == "")){
            System.out.println("Para seguir, aprieta Enter");
            teclaEnter = teclado.nextLine();
        }
    }
    static String numeroEscaños(double porcentaje){
        double nEscaños = (porcentaje/100) * 100;
        int escañosAsignados = (int) Math.round(nEscaños);
        String escaños = "";
        for (int i = 0; i< escañosAsignados; i++ ){
            escaños += "|";
        }
        return escaños;
    }
}
