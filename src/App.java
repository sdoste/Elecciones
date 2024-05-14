import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 65; i < 123; i++){
            if (!((i > 90) && (i < 97))){
                char letter = (char)i; 
                System.out.println(letter);
            } 
        }

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número del 33 al 126.");
        int respuesta = Integer.parseInt(teclado.nextLine());
        if ((respuesta >= 33) && (respuesta <= 126)){
            char letter = (char)respuesta; 
            System.out.println(letter);
        } else {
            System.out.println("Número fuera del valor.");
        }
        // Partido PSC = new Partido("PSC", 27.96);
        // Partido Junts = new Partido("Junts", 21.61);
        // Partido ERC = new Partido("ERC", 13.68);
        // Partido PP = new Partido("PP", 10.97);
        // Partido VOX = new Partido("VOX", 7.96);
        // Partido ComunsSumar = new Partido("Comuns-Sumar", 5.82);
        String generalResponse = "";
        ArrayList<Partido> partidos = new ArrayList<>();
        while(!generalResponse.equals("salir")){
            System.out.println("¿Qué quieres hacer?" + "\n" + "Crear partido | Mostrar resultados | Salir");
            generalResponse = teclado.nextLine().toLowerCase();
            System.out.println(generalResponse);
            switch (generalResponse) { 
                case "crear":
                case "crear partido":
                System.out.println("Introduce el nombre del partido");   
                String nombrePartido = teclado.nextLine();
                System.out.println("Introduce el porcentaje de votos del partido");
                double porcentaje = Double.parseDouble(teclado.nextLine());
                partidos.add(new Partido(nombrePartido, porcentaje));
                
                Metodos.aprietaEnter(teclado);
                Metodos.limpiarPantalla();
                    break;
                case "mostrar":
                case "mostrar resultados":
                    Metodos.mostrarResultados(partidos);
                    Metodos.aprietaEnter(teclado);
                    Metodos.limpiarPantalla();
                    break;
                case "salir":
                    break;
                default:
                System.out.println("Comando no válido");
                    break;
            }
        } 
        
        teclado.close();
    }
}
