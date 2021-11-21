package ru.netology.services;

import ru.netology.model.aggregates.DiseaseHistory;
import ru.netology.model.aggregates.VeterinarianReception;

public interface MainService {
    DiseaseHistory receivePet(VeterinarianReception reception);
}
