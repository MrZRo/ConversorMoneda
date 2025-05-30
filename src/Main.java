import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = null;
        while(true) {
            Conversor.exibirMenu();
            try {
                var opcion = Integer.valueOf(lectura.nextLine());
                switch (opcion) {

                    case 1 -> {
                        moneda = consulta.buscaMoneda("USD", "ARS");
                        String valor = (moneda.conversion_rate() >= 2) ? " Pesos Argentinos" : " Peso Argentino";
                        System.out.println("1 Dólar = " + moneda.conversion_rate() + valor);
                    }
                    case 2 -> {
                        moneda = consulta.buscaMoneda("ARS", "USD");
                        String valor = (moneda.conversion_rate() >= 2) ? " Dólares" : " Dólar";
                        System.out.println("1 Peso Argentino = " + moneda.conversion_rate() + valor);
                    }
                    case 3 -> {
                        moneda = consulta.buscaMoneda("USD", "BRL");
                        String valor = (moneda.conversion_rate() >= 2) ? " Reales Brasileños" : " Real Brasileño";
                        System.out.println("1 Dólar = " + moneda.conversion_rate() + valor);
                    }
                    case 4 -> {
                        moneda = consulta.buscaMoneda("BRL", "USD");
                        String valor = (moneda.conversion_rate() >= 2) ? " Dólares" : " Dólar";
                        System.out.println("1 Real Brasileño = " + moneda.conversion_rate() + valor);
                    }
                    case 5 -> {
                        moneda = consulta.buscaMoneda("USD", "COP");
                        String valor = (moneda.conversion_rate() >= 2) ? " Pesos Colombianos" : " Peso Colombiano";
                        System.out.println("1 Dólar = " + moneda.conversion_rate() + valor);
                    }
                    case 6 -> {
                        moneda = consulta.buscaMoneda("COP", "USD");
                        String valor = (moneda.conversion_rate() >= 2) ? " Dólares" : " Dólar";
                        System.out.println("1 Peso Colombiano = " + moneda.conversion_rate() + " Dólares");
                    }
                    case 7 -> {
                        System.out.println("Saliendo de la aplicación.");
                        return;
                    }

                }

            }
            catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 7.");
            } catch (RuntimeException e ) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
                return;
            }

        }

    }
}
