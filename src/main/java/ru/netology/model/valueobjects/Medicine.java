package ru.netology.model.valueobjects;

import java.util.Date;

public class Medicine {
    private final int code;
    private final String name;
    private final int dosage;
    private final Date expirationDate;

    public Medicine(int code, String name, int dosage, Date expirationDate) {
        this.code = code;
        this.name = name;
        this.dosage = dosage;
        this.expirationDate = expirationDate;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getDosage() {
        return dosage;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
