import java.util.Map;

public class DialingCodes {
    Map<Integer, String> dialingCodes = new java.util.HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (dialingCodes.containsKey(code)) {
            updateCountryDialingCode(code, country);
            return;
        }
        dialingCodes.put(code, country);
    }

    public Integer findDialingCode(String country) {
        if (dialingCodes.containsValue(country)) {
            return dialingCodes.entrySet().stream()
                    .filter(entry -> entry.getValue().equals(country))
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);
        } else {
            return null;
        }
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (dialingCodes.containsKey(code)) {
            dialingCodes.remove(code);
            dialingCodes.put(code, country);
        } else {
            return;
        }
    }
}
