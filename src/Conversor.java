public class Conversor {
    public static void exibirMenu() {
        System.out.println("""
                **************************
                Conversor de Monedas
                1. Dólar a Peso Argentino
                2. Peso Argentino a Dólar
                3. Dólar a Real Brasileño
                4. Real Brasileño a Dólar
                5. Dolar a Peso Colombiano
                6. Peso Colombiano a Dólar
                7. Mayor conversión de monedas
                8. Salir
                Seleccione una opción:
                **************************
        """);
    }
    public static void mayorConversion(){
        System.out.println("""
                **************************
                Monedas Disponibles:
                BOB:  Boliviano 
                CLP:  Peso Chileno 
                EUR:  Euro 
                GBP:  Libra Esterlina 
                MXN:  Peso Mexicano 
                PEN:  Sol Peruano
                **************************
                """);
    }


}
