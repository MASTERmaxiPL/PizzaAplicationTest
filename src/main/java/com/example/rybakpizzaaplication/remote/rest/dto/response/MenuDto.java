package com.example.rybakpizzaaplication.remote.rest.dto.response;

import java.util.List;

public class MenuDto {
    List<PizzaDto> pizzas;

    public MenuDto() {
    }

    public MenuDto(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }
    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}
