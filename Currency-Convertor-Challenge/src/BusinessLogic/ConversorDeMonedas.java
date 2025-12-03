package BusinessLogic;

import Service.ConsumiendoApi;
import Service.ConsumirJson;
import Service.DtoMonedas;

import java.util.Scanner;

public class ConversorDeMonedas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ConsumiendoApi api = new ConsumiendoApi();
        ConsumirJson mapper = new ConsumirJson();


        String json = api.obtenerJson();
        DtoMonedas respuesta = mapper.procesarRespuesta(json);

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("********************");
            System.out.println("Sea Bienvenido/a al conversor de monedas");
            System.out.println("1) Dólar a Peso Argentino");
            System.out.println("2) Peso Argentino a Dólar");
            System.out.println("3) Dólar a Peso Mexicano");
            System.out.println("4) Peso Mexicano a Dólar");
            System.out.println("5) Dólar a Real Brasileño");
            System.out.println("6) Real Brasileño a Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("********************");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.println("Ingrese el valor que desea convertir:");
                double monto = scanner.nextDouble();

                double resultado = 0.0;

                switch (opcion) {
                    case 1 -> resultado = monto * respuesta.conversion_rates().get("ARS");
                    case 2 -> resultado = monto / respuesta.conversion_rates().get("ARS");
                    case 3 -> resultado = monto * respuesta.conversion_rates().get("MXN");
                    case 4 -> resultado = monto / respuesta.conversion_rates().get("MXN");
                    case 5 -> resultado = monto * respuesta.conversion_rates().get("BRL");
                    case 6 -> resultado = monto / respuesta.conversion_rates().get("BRL");
                }

                System.out.println("Resultado: " + resultado);
            } else if (opcion == 7) {
                System.out.println("Gracias por usar el conversor de monedas");
            } else {
                System.out.println("Opción inválida, intente nuevamente.");
            }
        }

        scanner.close();
    }
}
