package lesson2;

public enum Color {
    BLUE("Синий", 123),
    GREEN("Зеленый", 123),
    WHITE("Белый", 123),
    BLACK("Черный", 777),
    RED("", 123),
    LIGHT_BLUE("", 123);

    private final String description;
    private final int code;

    Color(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}
