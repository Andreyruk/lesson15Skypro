public class ValidateUtils {
    public static String validateString(String value, String defaultMessage) {
        return value == null || value.isBlank() || value.isEmpty() ? defaultMessage : value;
    }
}
