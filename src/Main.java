import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Datos por defecto: ");
        DronLiviano d = new DronLiviano();
        d.mostrarInformacion();
        DronCarga dc = new DronCarga();
        dc.mostrarInformacion();
        DronEmergencia dm = new DronEmergencia();
        dm.mostrarInformacion();
        System.out.println("-------------------------");

        System.out.print("Ingrese el codigo del Dron: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese el modelo del Dron: ");
        String modelo = sc.nextLine();
        System.out.print("Ingrese la Distancia en KM del Dron: ");
        double km = sc.nextDouble();
        System.out.print("Ingrese el costo Base del Dron: ");
        double costoBase = sc.nextDouble();
        System.out.print("Ingrese una opcion de Dron (1=Dron Liviano, 2=Dron Carga, 3=Dron Emergencia): ");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("--- Dron Liviano ---");
            System.out.print("Ingrese las Horas limite del Dron (de 0 a 2): ");
            double horas = sc.nextDouble();
            System.out.print("Ingrese el limite Peso del Dron (de 0 a 5): ");
            double peso  = sc.nextDouble();
            DronLiviano dronLiviano = new DronLiviano(codigo, modelo, km, peso, horas, costoBase);
            dronLiviano.mostrarInformacion();
        }
        if (opcion == 2) {
            System.out.println("--- Dron Carga ---");
            System.out.print("Ingrese las Horas limite del Dron (de 0 a 5): ");
            double horas = sc.nextDouble();
            System.out.print("Ingrese el limite Peso del Dron (de 0 a 30): ");
            double peso  = sc.nextDouble();
            System.out.print("Ingrese el costo por Kg del paquete: ");
            double costoCarga = sc.nextDouble();
            DronCarga dronCarga = new DronCarga(codigo, modelo, km, peso, horas, costoBase,costoCarga);
            dronCarga.mostrarInformacion();
        }
        if (opcion == 3) {
            System.out.println("--- Dron Emergencia ---");
            System.out.print("Ingrese las Horas limite del Dron (de 0 a 3): ");
            double horas = sc.nextDouble();
            System.out.print("Ingrese el limite Peso del Dron (de 0 a 10): ");
            double peso  = sc.nextDouble();
            System.out.print("Ingrese el recargo por Urgencia del paquete: ");
            double costoUrgencia = sc.nextDouble();
            System.out.print("Ingrese el nivel de prioridad (1,2 o 3): ");
            int nivelDePrioridad = sc.nextInt();
            DronEmergencia dronEmergencia = new DronEmergencia(codigo, modelo, km, peso, horas, costoBase,costoUrgencia,nivelDePrioridad);
            dronEmergencia.mostrarInformacion();
        }



    }
}
