package Service;

import com.google.gson.Gson;

public class ConsumirJson {
    private final Gson gson = new Gson();

    public DtoMonedas procesarRespuesta(String json) {
        return gson.fromJson(json, DtoMonedas.class);
}
}