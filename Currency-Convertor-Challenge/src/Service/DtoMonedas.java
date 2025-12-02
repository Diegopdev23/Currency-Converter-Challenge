package Service;

import java.util.Map;

public record DtoMonedas(String base_code, String target_code, Map<String, Double> conversion_rates) {
}
