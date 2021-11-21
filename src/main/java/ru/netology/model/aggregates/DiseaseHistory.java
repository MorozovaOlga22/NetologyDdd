package ru.netology.model.aggregates;

import ru.netology.model.entities.Pet;
import ru.netology.model.entities.Veterinarian;
import ru.netology.model.valueobjects.Medicine;
import ru.netology.model.valueobjects.Procedure;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiseaseHistory {
    private final int id;
    private final Pet pet;
    private Veterinarian veterinarian;
    private Date date;
    private final List<Medicine> medicines = new ArrayList<>();
    private final List<Procedure> procedures = new ArrayList<>();
    private String status;
    private String description;

    public DiseaseHistory(int id, Pet pet, Veterinarian veterinarian, Date date, String status, String description) {
        this.id = id;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.date = date;
        this.status = status;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void removeMedicine(int medicineCode) {
        medicines.removeIf(medicine -> medicineCode == medicine.getCode());
    }

    public void addProcedure(Procedure procedure) {
        procedures.add(procedure);
    }

    public void removeProcedure(int procedureCode) {
        procedures.removeIf(procedure -> procedureCode == procedure.getCode());
    }
}
