package ru.netology.services;

import ru.netology.model.aggregates.DiseaseHistory;
import ru.netology.model.aggregates.VeterinarianReception;

import java.util.List;

public interface MainService {
    /**
     * Провести прием
     */
    DiseaseHistory receivePet(VeterinarianReception reception);

    /**
     * Выбрать, какой прием провести следующим
     */
    VeterinarianReception chooseNextReception(List<VeterinarianReception> receptions);
}
