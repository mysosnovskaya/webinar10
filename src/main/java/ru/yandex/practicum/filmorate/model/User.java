package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import ru.yandex.practicum.filmorate.validation.StartsWith;

@Data
public class User {
    private int id;
    @NotBlank
    @StartsWith(value = "Spring")
    private String name;
    private String email;
}
