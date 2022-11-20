public class Person {
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    public Person(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = ValidateUtils.validateString(name, defaultMessage);
        this.yearOfBirth = validateYear(yearOfBirth);
        this.town = ValidateUtils.validateString(town, defaultMessage);
        this.jobTitle = ValidateUtils.validateString(jobTitle, defaultMessage);
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Год моего рождения " +
                yearOfBirth + ". Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    private static String defaultMessage = "Нет информации";

    public static int validateYear(int value) {
        return value < 0 ? Math.abs(value) : value;
    }
}