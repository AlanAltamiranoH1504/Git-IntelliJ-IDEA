package altamirano.hernandez;

import java.util.Scanner;

public class Mensaje {
    public String solicitaDatos(String mensaje){
        System.out.println("mensaje = " + mensaje);
        Scanner sanner = new Scanner(System.in);
        String dato = sanner.nextLine();
        return dato;
    }
}
