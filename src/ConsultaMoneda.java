import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public static Moneda buscaMoneda(String monedaBase, String monedaDestino) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7ae9374fd63262a0584d56b9/pair/"+monedaBase+"/"+monedaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré ese valor.");
        }
    }

    public static Moneda buscaMonedaPlus(String monedaBase, String monedaDestino) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7ae9374fd63262a0584d56b9/pair/"+monedaBase+"/"+monedaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré ese valor.");
        }
    }
}
