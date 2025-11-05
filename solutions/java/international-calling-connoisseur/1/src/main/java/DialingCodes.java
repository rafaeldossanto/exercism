import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> dictionary = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dictionary;
    }

    public void setDialingCode(Integer code, String country) {
        dictionary.put(code, country);
    }

    public String getCountry(Integer code) {
        return dictionary.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (dictionary.containsKey(code)) {
            return;
        }
        if (dictionary.containsValue(country)) {
            return;
        }

        dictionary.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(country)) {
                dictionary.remove(entry.getKey());
                dictionary.put(code, country);
            }
        }
    }
}
