package ru.netology.model.valueobjects;

public class Procedure {
    private final int code;
    private final String name;
    private final String description;

    public Procedure(int code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
