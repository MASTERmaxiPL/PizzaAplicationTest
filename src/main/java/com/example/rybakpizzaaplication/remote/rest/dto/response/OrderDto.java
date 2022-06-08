package com.example.rybakpizzaaplication.remote.rest.dto.response;

import com.example.rybakpizzaaplication.domain.StatusType;
import com.example.rybakpizzaaplication.remote.rest.dto.request.PersonOrderDto;
import com.example.rybakpizzaaplication.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private StatusType statusType;
    private List<PizzaOrderDto> pizzaDtos;
    private PersonOrderDto personDto;

    public OrderDto() {
    }

    public OrderDto(Integer id, StatusType statusType, List<PizzaOrderDto> pizzaDtos, PersonOrderDto personDto) {
        this.id = id;
        this.statusType = statusType;
        this.pizzaDtos = pizzaDtos;
        this.personDto = personDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }

    public List<PizzaOrderDto> getPizzaDtos() {
        return pizzaDtos;
    }

    public void setPizzaDtos(List<PizzaOrderDto> pizzaDtos) {
        this.pizzaDtos = pizzaDtos;
    }

    public PersonOrderDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonOrderDto personDto) {
        this.personDto = personDto;
    }
}
