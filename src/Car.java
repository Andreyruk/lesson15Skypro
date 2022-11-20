public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String color;
    private Integer year;
    private String country;

    public Car(String brand, String model, Integer year, Double engineVolume, String color, String country) {
        this.brand = ValidateUtils.validateString(brand, defaultMessage);
        this.model = validateParameter(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateParameter(country);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Марка автомобиля: " + brand + ", модель: " + model + ", год выпуска: " + year +
                ", объем двигателя: " + engineVolume + ", цвет кузова: " + color + ", страна сборки: " + country;
    }

    private static String defaultMessage = "default";

    //или
    public static String validateParameter(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }

    public static Double validateEngineVolume(Double value) {
        return value == null || value < 0 ? 1.5 : value;
//        return value < 0 ? Math.abs(value) : value;
    }

    public static String validateColor(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "белый" : value;
    }

    //public static int validateYear(int value) {
    //    return value <= 0 ? 2000 : value;
//    или
    public static Integer validateYear(Integer value) {
        return value == null || value <= 0 ? 2000 : value;
    }
}
