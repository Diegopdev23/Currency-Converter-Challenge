package Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumiendoApi {
    private final String APIKEY = System.getenv("API-KEY");
    private final HttpClient cliente = HttpClient.newHttpClient();
    private final String URL = "https://v6.exchangerate-api.com/v6/" + APIKEY + "/latest/USD";
    private final HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(URL))
            .build();

    public String obtenerJson () {
        try {
            HttpResponse<String> respuesta = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            return respuesta.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al llamar la API", e);
        }
    }
}
